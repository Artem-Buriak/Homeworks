package homework21;

import homework19.Product;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestRunner {

    public void start(Class obj) throws Exception {

        System.out.println("Get array of methods");
        Method[] methods = obj.getClass().getDeclaredMethods();

        //5. Методи з анотаціями @BeforeSuite та @AfterSuite у межах одного “класу-тесту” повинні бути присутніми в єдиному екземплярі,
        //інакше необхідно викинути виняток.
        System.out.println("\nSearching for BeforeSuite method");
        int cntOfBeforeAntMethods = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(BeforeSuite.class)) {
                cntOfBeforeAntMethods++;
                if (cntOfBeforeAntMethods>1) {throw new Exception("BeforeSuite should be used in 1 instance");}
                method.setAccessible(true);
                method.invoke(obj);
            }
        }

        System.out.println("\nCreating sorted list of Test methods");
        List<Method> methodsTest = new ArrayList<>();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class)) {
                methodsTest.add(method);
            }
        }
        System.out.println("Sort & invoke list of Test methods");
        Comparator<Method> comparator = Comparator.comparing(x -> x.getAnnotation(Test.class).priority());
        methodsTest.stream().sorted(comparator).forEach(method -> {
            method.setAccessible(true);
            try {
                method.invoke(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        });


        System.out.println("\nSearching for AfterSuite method");
        int cntOfAfterAntMethods = 0;
        for (Method method : methods) {
            if (method.isAnnotationPresent(AfterSuite.class)) {
                cntOfAfterAntMethods++;
                if (cntOfAfterAntMethods>1) {throw new Exception("AfterSuite should be used in 1 instance");}
                method.setAccessible(true);
                method.invoke(obj);
            }
        }
    }
}
