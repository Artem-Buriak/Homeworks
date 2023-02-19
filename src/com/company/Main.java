package com.company;
import homework10.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        FileData file1 = new FileData("firstFile",10000,"/path/MyDirectory");
        FileData file2 = new FileData("secondFile",5000,"/path/MyDirectory");
        FileData file3 = new FileData("thirdFile",85000,"/path/Music");
        FileData file4 = new FileData("thirdFile",333,"/path/Pictures");

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file1);
        fileNavigator.add(file2);
        fileNavigator.add(file3);
        fileNavigator.add(file4);

        fileNavigator.find("/path/Music");
        fileNavigator.find("/path/Video");
        System.out.println(fileNavigator);

        fileNavigator.filterBySize(11000);
        fileNavigator.filterBySize(6000);

        fileNavigator.sort();

        fileNavigator.remove("/path/MyDirectory");
        fileNavigator.remove("/path/MyDirectory1");

    }
}

