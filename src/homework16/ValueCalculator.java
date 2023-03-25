package homework16;

import java.util.Arrays;

public abstract class ValueCalculator {
    public static int arraySize = 1000001;
    public static float[] array = new float[arraySize];
    public static int half = arraySize/2;
    public static float[] ar1 = new float[arraySize-half];
    public static float[] ar2 = new float[half];

    public static long start;
    public static long finish;

    public static void main() {
        //Chekced start time
        start = System.currentTimeMillis();
        System.out.println("Start time: "+start);
        //Creating array
        for (var i = 0; i<arraySize; i++) {
            array[i] = 1;
        }
        System.out.println("Created array with "+arraySize+" elements");

        //Spliting array for 2 half
        System.arraycopy(array, 0 , ar1, 0, (arraySize-half));
        System.arraycopy(array, half, ar2, 0, half);
        System.out.println("Split array for 2 halfs");

        //Thread 1 with first half
        Thread th1 = new Thread(new MyThread(ar1.length, ar1,1));
        System.out.println("Start "+th1.getName());
        th1.start();

        //Thread 2 with second half
        Thread th2 = new Thread(new MyThread(ar2.length, ar2,2));
        System.out.println("Start "+th2.getName());
        th2.start();

        //Check time
        long finish = System.currentTimeMillis();
        System.out.println("Finish time: "+start);
        long diff = finish-start;
        System.out.println("Time of executing: "+diff+" ms");
    }

}
