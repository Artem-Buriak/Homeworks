package homework19;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws Exception {
    //Creating list of products
        List<Product> list = new ArrayList<>();
        list.add(new Product("Book", 30, true, new Date())); Thread.sleep(25);
        list.add(new Product("Toy", 200, false, new Date())); Thread.sleep(25);
        list.add(new Product("Book", 350, false, new Date())); Thread.sleep(25);
        list.add(new Product("TV", 10000, false, new Date())); Thread.sleep(25);
        list.add(new Product("Book", 70, true, new Date()));

        list1(list);
        list2(list);
        try {
            list3(list);
        } catch (Exception e) {
            System.out.println("Exception: No products in category Book");
        }
        list4(list);
        list5(list);
        list6(list);
    }

    //1.2 Реалізувати метод отримання всіх продуктів у вигляді списку, категорія яких еквівалентна “Book” та ціна більш ніж 250.
    public static void list1(List<Product> list) {
        System.out.println("Task 1.2, Books & price more than 250");
        Stream<Product> stream = list.stream();
        stream.filter(x -> x.getType() == "Book" && x.getPrice()>=250)
              .forEach(System.out::println);
    }
    //2.2 Реалізувати метод отримання всіх продуктів як списку, категорія яких еквівалентна “Book” і з можливістю застосування знижки.
    //Фінальний список повинен містити продукти з застосованою знижкою 10%.
    public static void list2(List<Product> list) {
        System.out.println("Task 1.2, Books with discount");
        Stream<Product> stream = list.stream();
        stream.filter(x -> x.getType() == "Book" && x.discount)
              .peek(x -> x.setPrice(x.getPrice()*0.9))
              .forEach(System.out::println);
    }

    //3.2 Реалізувати метод отримання найдешевшого продукту з категорії “Book”
    //3.3 У випадку, якщо жоден продукт не знайдено (ситуація, коли немає продукту з категорією), викинути виняток з повідомленням “Продукт [категорія: ім'я_категорії] не знайдено”.
    public static void list3(List<Product> list) throws Exception {
        Comparator<Product> comparator = Comparator.comparing(x -> x.getPrice());

        System.out.println("Task 1.3, Cheapest book");
        Stream<Product> stream = list.stream();
        Product cheapestBook = stream.filter(x -> x.getType() == "Book")
                                     .min(comparator)
                                     .orElseThrow(Exception::new);
        System.out.println(cheapestBook);
    }

    //4.2 Реалізувати метод отримання трьох останніх доданих продуктів
    public static void list4(List<Product> list) {
        Comparator<Product> comparator = Comparator.comparing(x -> x.getCreateDate());

        System.out.println("Task 1.4, Three newest products");
        Stream<Product> stream = list.stream();
        stream.sorted(comparator.reversed())
                .limit(3)
                .forEach(System.out::println);
    }
    //5.2 Реалізувати метод калькуляції загальної вартості продуктів, які відповідають наступним критеріям:
    //- продукт додано протягом поточного року
    //- продукт має тип “Book”
    //- ціна продукту не перевищує 75
    public static void list5(List<Product> list) {
        System.out.println("Task 1.5, Products with filters");
        Stream<Product> stream = list.stream();
        stream.filter(x -> x.getType() == "Book")
                .filter(x -> x.getPrice()<=75)
                .filter(x -> x.getCreateDate().getYear() == new Date().getYear())
                .forEach(System.out::println);
    }
    //6.2 Реалізувати метод групування об'єктів за типом продукту. Таким чином результатом виконання методу
    //буде тип даних “Словник”, що зберігає пару ключ-значення: {тип: список_продуктів}
    public static void list6(List<Product> list) {
        System.out.println("Task 1.6, Group by product types");
        Stream<Product> stream = list.stream();
        Map a = stream.collect(Collectors.groupingBy(x -> x.getType()));
        System.out.println(a);
    }
}
