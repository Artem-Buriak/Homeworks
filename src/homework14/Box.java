package homework14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box <T>{
    public List<Fruit> boxList = new ArrayList<>();
    public String insideType;
    public float totalWeight = 0;

    public Box() {
        System.out.println("New box was created!");
    }
    //2.4. Реалізувати метод додавання фрукта (1 од.) до коробки.
    public void add(Fruit fruit) {
        System.out.println("Result of method add():");
        if (insideType == null) {
            System.out.println(fruit.getType()+" was added");
            boxList.add(fruit);
            totalWeight += fruit.weight;
            insideType = fruit.getType();
        } else if (insideType.equals(fruit.getType())) {
            System.out.println(fruit.getType()+" was added");
            totalWeight += fruit.weight;
            boxList.add(fruit);
        } else {
            System.out.println(fruit.getType()+" is impossible to add to this box");
        }
        System.out.println(boxList);
    }
    //2.5. Реалізувати метод додавання фруктів (множ.) у коробку.
    public void add(List<? extends Fruit> arr) {
        arr.forEach((n) -> this.add(n));
    }
    //2.7 У класі Box реалізувати метод compare. Метод робить порівняння поточної коробки з переданою як параметр.
    //Повертати true - якщо їх ваги рівні, інакше - false
    //ВАЖЛИВО! Можна порівнювати коробки, що містять різні фрукти. Так, коробки з яблуками можна порівняти з коробками з апельсинами і так далі.
    public boolean compare(Box box) {
        if (this.totalWeight == box.totalWeight) {
            System.out.println("Result of method compare(): Boxes have the same wight - "+this.totalWeight);
            return true;
        } else {
            System.out.println("Result of method compare(): Boxes are different ("+this.totalWeight+" & "+box.totalWeight+")");
            return false;
        }
    }
    //2.8 Реалізувати метод merge. Метод виконує пересип з переданої коробки як параметр, в поточну.
    //Однак варто враховувати, що в одну коробку не можна скласти фрукти різного типу.
    public void merge(Box box) {
        if (box.boxList.size()>0) {
            if (this.insideType == box.insideType) {
                this.add(box.boxList);
                System.out.println("Result of method merge(): All fruits from box was added");
                this.totalWeight = 0;
                box.boxList.clear();
            } else {
                System.out.println("Result of method merge(): Boxes have different fruits inside");
            }
        } else {
            System.out.println("Result of method merge(): Second box is empty");
        }
    }
}
