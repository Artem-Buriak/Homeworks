package homework12;

import java.util.Arrays;

public class Algorithm {

    //Реалізувати алгоритм "Швидкого сортування"
    public static Integer[] quickSort(Integer[] ar, int start, int end) {
        if (ar.length == 0) {
            return ar;
        }

        if (start >= end) {
            return ar;
        }
        //Обираємо опорний елемент
        //int middle = end;
        int middle = start + (end - start)/2;
        int pivot = ar[middle];
        System.out.println("quickSort with pivot "+pivot+" on position "+middle);

        //Менші елементи збираємо зліва, більші елементи справа
        int i = start, j = end;
        while (i <= j) {
            while (ar[i] < pivot) {
                i++;
            }

            while (ar[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j] = temp;
                i++;
                j--;
            }
        }

        //Так само для підмасивів
        if (start < j)
            quickSort(ar, start, j);

        if (end > i)
            quickSort(ar, i, end);
        return ar;
    }
//Реалізувати алгоритм "Сортування перемішуванням (Шейкерне сортування)"
    public static Integer[] shakerSort(Integer[] ar) {
        int tmp;
        boolean calc = true;//для розуміння, коли треба стопнутись, бо нічого не змінилось

        while(calc) {
            calc = false;
            System.out.println("shakerSort ==>>");
            for (int i = 0; i < ar.length-1; i++) {
                if (ar[i] > ar[i + 1]) {
                    calc = true;
                    tmp = ar[i];
                    ar[i] = ar[i + 1];
                    ar[i + 1] = tmp;
                }
            }
            if (calc == false) {
                break;
            }
            calc = false;

            System.out.println("shakerSort <<==");
            for (int j = ar.length-2; j >= 0; j--) {
                if (ar[j]>ar[j+1]) {
                    calc = true;
                    tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
            }
        }

        return ar;
    }

}



