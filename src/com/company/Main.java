package com.company;
import homework9.*;
import phonebook.*;
import phonebook.Record;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//Блок роботи з телефоним довідником
        Directory directory = new Directory();
        directory.add("Ivan", "+3809911122333");
        directory.add("Anton", "+3809911122333");
        directory.add("Oscar", "+3809977722333");
        directory.add("Barak", "+3809946841321");
        directory.add("Ivan", "+3809911122444");
        directory.add("George", "+380990011224");

        directory.find("Anton");
        directory.findAll("Ivan");

//4. *** Створити метод findOccurance, що приймає на вхід рядковий список як параметр. Список заповнений довільними словами
// 10-20 штук, які можуть повторюватись у необмеженій кількості. Обчислити скільки разів трапляється кожне слово.
// Результат повернути у вигляді списку структур, що описують повторення кожного окремого взятого слова.
        ArrayList<String> toCalcOccurance = new ArrayList<String>(
                Arrays.asList("one","two","one","two","three","one","two","one","two","three","quattro","uno","uno")
        );

        workingWithLists.findOccurance(toCalcOccurance);

//4. ** Створити метод calcOccurance, який приймає на вхід рядковий список як параметр. Список заповнений довільними словами
// 10-20 штук, які можуть повторюватись у необмеженій кількості. Обчислити скільки разів трапляється кожне слово.
        workingWithLists.calcOccurance(toCalcOccurance);

//3. Створити метод findUnique, що приймає на вхід числовий список, що складається з довільних значень,
//які можуть повторюватися в необмеженій кількості.
//Необхідно повернути новий числовий список, що містить тільки унікальні числа.
    ArrayList<Integer> numbers = new ArrayList<Integer>(
            Arrays.asList(1,2,2,24,4,4,5,1,3,7,3,1,5)
    );
        workingWithLists.findUnique(numbers);
//2. Створити метод toList, що приймає на вхід цілісний масив довільної довжини.
// Конвертувати масив у список відповідного типу даних та повернути з методу.
        String[] convert = {"first", "second", "third", "fourth", "fifth"};
        workingWithLists.toList(convert);

//1. Створити метод countOccurance, що приймає на вхід рядковий список як параметр і довільний рядок.
//Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій кількості.
//Порахувати скільки разів зустрічається переданий рядок як другий аргумент.
        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList(
                        "puppet",
                        "on",
                        "string",
                        "Tracy",
                        "Island",
                        "time-travelin",
                        "diamond",
                        "cutter-shaped",
                        "heartaches",
                        "come",
                        "find",
                        "you",
                        "four",
                        "some",
                        "velvet",
                        "morning",
                        "years",
                        "too",
                        "late")
        );
        String target = "morning";
        workingWithLists.countOccurance(list, target);
    }
}

