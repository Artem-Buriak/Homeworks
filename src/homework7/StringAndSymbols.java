package homework7;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Locale;
import java.util.OptionalInt;
import java.util.Scanner;

public class StringAndSymbols {

//2. Створити метод findSymbolOccurance. Метод приймає як параметр рядок і символ.
//Необхідно обчислити, скільки разів символ зустрічається в переданому рядку і повернути це числове значення.
    public static void findSymbolOccurance(String string, char chr) {
        int count = 0;
        for (var i = 0; i<string.length(); i++) {
            if (string.charAt(i) == chr) {
                count++;
            }
        }
        System.out.println("result of findSymbolOccurance() with string \""+string+"\" and char \'"+chr+"\' is "+count);
    }
//3. Створити метод findWordPosition. Метод приймає як параметри два рядки (source, target).
//Необхідно з'ясувати, чи є target (підрядок) частиною рядка source. Якщо так, тоді повернути номер позиції (індекс)
//першого елемента підрядка у рядку, інакше повернути -1.
    public static void findWordPosition(String source, String target) {
        System.out.println("result of findWordPosition() with source \""+source+"\" and target \""+target+"\" is position "+source.indexOf(target));
    }
//4. Створити метод stringReverse. Метод приймає як параметр - рядок. Необхідно її розгорнути та повернути змінений варіант.
    public static String stringReverse(String string) {
        String result = new String();
        for (var i = string.length()-1; i>=0; i--) {
            result += string.charAt(i);
        }
        System.out.println("result of stringReverse() with source \""+string+"\" is \""+result+"\"");
        return result;
    }
//5. Створити метод isPalindrome. Метод приймає як параметр - рядок.
//Необхідно Перевірити, чи є переданий рядок паліндромом. Якщо так, тоді повернуть true, інакше false.
    public static void isPalindrome(String string) {
        string = string.toLowerCase();
        String check = stringReverse(string);
        if (string.equals(check)) {
            System.out.println("We call stringReverse() second time inside isPalindrome() and get the result that \""+string+"\" is palindrome");
        } else {
            System.out.println("We call stringReverse() second time inside isPalindrome() and get the result that \""+string+"\" is NOT palindrome");
        }
    }

//6. Гра в слова
    public static String startGame() {
        //Старт гри, загадуємо слово
        int i = (int) (Math.random()*25);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("I`ve mentioned one word try to suggest ↓↓↓ (p.s. it`s "+words[i]+')');
        return words[i];
    }

    public static void wordGame(String word) {
        //Запитуємо слово, готуємо змінні
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        String showToUser = new String();
        String checker = new String();
        //Визначаємо мінімальну кількість символів для перевірки
        int min = (answer.length() < word.length()) ? answer.length() : word.length();

        //Пробігаємось посимвольно для перевірки рівності строк
        for (var i = 0; i<=15; i++) {
            if (i < min) {
                showToUser += (word.charAt(i) == answer.charAt(i)) ? word.charAt(i) : '#';
                checker += (word.charAt(i) == answer.charAt(i)) ? word.charAt(i): "";
            } else {
                showToUser += '#';
            }
        }
        //Якщо строки вірні - кажемо що юзер переміг, якщо ні - запускаємо опитування по новій
        //+ перевірка на рівну довжину (якщо загадане слово є частиною відповіді)
        if (checker.equals(word) && answer.length() == word.length()) {
            System.out.println("You`re WINNER, correct word is "+word+"!");
        } else {
            System.out.println("You were close, try one more time ↓↓↓");
            System.out.println(showToUser);
            wordGame(word);
        }
    }
}
