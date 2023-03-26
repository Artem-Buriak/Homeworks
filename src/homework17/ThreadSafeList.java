package homework17;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//0.1. Створити клас ThreadSafeList. Клас імплементрізує потокобезпечну колекцію.
//0.1 Реалізувати методи: add, remove, get
//0.2 Методи повинні бути реалізовані з урахуванням того, що вони будуть використовуватися в конкурентному середовищі.


public class ThreadSafeList {
    List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

    synchronized void add(int a) {
        System.out.println("add(): element "+a+" was added");
        syncList.add(a);
    }
    synchronized void remove(int index) {
        System.out.println("remove(): element with index "+index+" was removed");
        syncList.remove(index);
    }
    synchronized int get(int index) {
        System.out.println("get(): element with index "+index+" value is "+syncList.get(index));
        return syncList.get(index);
    }
}
