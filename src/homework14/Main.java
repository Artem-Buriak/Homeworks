package homework14;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //task1
        String[] arr1 = {"A", "B", "C"};
        Integer[] arr2 = {1, 2, 3};
        Main.toList(arr1);
        Main.toList(arr2);
        //create box
        Box boxOfApples = new Box();
        boxOfApples.add(new Apple());
        boxOfApples.add(new Apple());
        boxOfApples.add(new Orange()); //try to add another fruit

        Box boxOfOranges = new Box();
        boxOfOranges.add(new Orange());
        boxOfOranges.add(new Apple());
        //comparing boxes with different types
        boxOfApples.compare(boxOfOranges);
        //add list to box
        List<Fruit> fr = new ArrayList<>();
        fr.add(new Orange());
        fr.add(new Apple());
        fr.add(new Orange());
        boxOfApples.add(fr);

        //merge boxes
        Box boxOfApples2 = new Box();
        boxOfApples2.add(new Apple());
        boxOfApples2.add(new Apple());
        boxOfApples.merge(boxOfApples2);
    }
//1. Створити метод toList. Метод приймає на вхід масив і перетворює їх у список.
//Колекція зберігає такий самий тип даних, як і вхідний масив.
//Після перетворення необхідно повернути щойно створений список.
    public static <T> List toList(T[] ar) {
        List<T> newList = Arrays.asList(ar);
        System.out.println("Get array "+Arrays.toString(ar)+" for method toList");
        System.out.println("Result: "+newList.toString());
        return newList;
    }
}
