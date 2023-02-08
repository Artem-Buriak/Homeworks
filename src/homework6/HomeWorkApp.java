package homework6;

public class HomeWorkApp {

    public static void main() {
        //printThreeWords();
        //checkSumSign();
        //printColor();
        //compareNumbers();
        //checkSum(1,115);
        //checkPositive(-15);
        //checkNegative(1);
        //typer("Test",5);
        checkYear(2022);

    }
    //10. * Написати метод, який визначає, чи є рік високосним, і повертає boolean (високосний – true, не високосний – false).
    //Кожен 4-й рік є високосним, крім кожного 100-го, причому кожен 400-й – високосний

    public static Boolean checkYear(int year) {
        Boolean answer = false;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            answer = true;
        }
        return answer;
    }

    //9. Написати метод, якому як аргументи передається рядок і число, метод повинен
    //надрукувати в консоль зазначений рядок, вказану кількість разів;
    public static void typer(String string, int a) {
        for (var i = 0; i < a; i++) {
            System.out.println(string);
        }
    }

    //8. Написати метод, якому як параметр передається ціле число.
    //Метод повинен повернути true, якщо число є негативним, і повернути false якщо позитивне.
    public static Boolean checkNegative(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //7. Написати метод, якому як параметр передається ціле число, метод повинен
    // надрукувати в консоль, чи додатнє число передали або від’ємне. Примітка: нуль вважаємо позитивним числом.
    public static void checkPositive(int a) {
        if (a < 0) {
            System.out.println(a + " є від'ємним числом");
        } else {
            System.out.println(a + " є позитивним числом");
        }
    }

    //6. Написати метод, який приймає на вхід два цілих числа і перевіряє, що
    // їхня сума лежить в межах від 10 до 20 (включно), якщо так – повернути true, інакше – false.
    public static Boolean checkSum(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    //5. Створіть метод compareNumbers(), у тілі якого оголосіть дві int змінні a і b, та ініціалізуйте їх будь-якими значеннями, якими захочете.
    //Якщо a більше або одно b, необхідно вивести в консоль повідомлення “a >= b”, інакше “a < b”;
    public static void compareNumbers() {
        int a = -102;
        int b = -41;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    //4. Створіть метод printColor() у тілі якого задайте int змінну value та ініціалізуйте її будь-яким значенням.
    //Якщо значення менше 0 (0 включно), то в консоль метод повинен вивести повідомлення "Червоний",
    //якщо лежить в межах від 0 (0 виключно) до 100 (100 включно), то "Жовтий", якщо більше 100 (100 виключно) - "Зелений";

    public static void printColor() {
        int value = -25;
        String answer;
        if (value <= 0) {
            answer = "Червоний";
        } else if (value > 0 && value <= 100) {
            answer = "Жовтий";
        } else {
            answer = "Зелений";
        }
        System.out.println(answer);
    }

    //3. Створіть метод checkSumSign(), у тілі якого оголосіть дві int змінні a і b,
    // та ініціалізуйте їх будь-якими значеннями, якими захочете. Далі метод повинен підсумувати ці змінні,
    //і якщо їх сума більша або дорівнює 0, то вивести в консоль повідомлення "Сума позитивна", інакше - "Сума негативна";
    public static void checkSumSign() {
        int a = 5;
        int b = -7;
        if (a+b>=0) {
            System.out.println("Сума позитивна");
        } else {
            System.out.println("Сума негативна");
        }
    }

    //2. Створіть метод printThreeWords(), який під час виклику повинен надрукувати в стовпець у три слова: Orange, Banana, Apple.
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

}
