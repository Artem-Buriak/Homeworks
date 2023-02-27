package homework12;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] ar = new Integer[10];
        Integer[] ar2 = new Integer[10];

        for (var i = 0; i<ar.length; i++) {
            ar[i] = (int) (Math.random()*100);
            ar2[i] = (int) (Math.random()*100);
        }
        System.out.println("Array to sort by quickSort():\n"+Arrays.asList(ar));
        Algorithm.quickSort(ar, 0, 9);
        System.out.println("Array sorted by quickSort():\n"+Arrays.asList(ar));

        System.out.println("\nArray to sort by shakerSort():\n"+Arrays.asList(ar2));
        Algorithm.shakerSort(ar2);
        System.out.println("Array sorted by shakerSort():\n"+Arrays.asList(ar2));
    }
}
