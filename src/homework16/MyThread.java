package homework16;

import java.util.Arrays;

public class MyThread implements Runnable{

    int t;
    float[] arr = new float[t];
    int aim;

    public MyThread(int t, float[] arr, int aim) {
        this.t = t;
        this.arr = arr;
        this.aim = aim;
    }


    @Override
    public void run() {
        System.out.println("start run() for "+t+" elements");
        //Change value
        for (int i = 0; i<t; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        if (aim == 1) {
            ValueCalculator.ar1 = arr;
            System.out.println("Changed first half of array");
            System.arraycopy(ValueCalculator.ar1, 0, ValueCalculator.array, 0, ValueCalculator.ar1.length);
            //System.out.println(Arrays.toString(ValueCalculator.ar1));
        } else {
            ValueCalculator.ar2 = arr;
            System.out.println("Changed second half of array");
            System.arraycopy(ValueCalculator.ar2, 0, ValueCalculator.array, ValueCalculator.ar1.length, ValueCalculator.ar2.length);
            //System.out.println(Arrays.toString(ValueCalculator.ar2));
        }
        ValueCalculator.finish = System.currentTimeMillis();
    }
}
