package homework8;

import java.sql.Array;

public class ArrayValueCalculator {


    public static int doCalc(String[][] toCalc) throws ArraySizeException, ArrayDataException {
        //Кількість елментів на вході
        int count = 0;
        int result = 0;

        //Збережемо один цикл, тому тут і порахуємо суму і розмір матриці
        for (var i = 0; i<toCalc.length; i++) {
            for (var j = 0; j<toCalc[i].length; j++) {
                try {
                    result += Integer.parseInt(toCalc[i][j]);
                } catch (NumberFormatException nfe) {
                    throw new ArrayDataException(i,j);
                }

                count++;
            }
        }
        //4х4 це 16 елементів та 4 строки
        if (count!=16 || toCalc.length!=4) {
            throw new ArraySizeException(count, toCalc.length);
        }
        return result;
    }

    public static class ArrayDataException extends Exception {
        public int locationA;
        public int locationB;

        public ArrayDataException(int i, int j) {
            this.locationA = i;
            this.locationB = j;
        }
    }

    public static class ArraySizeException extends Throwable {
        public int count;
        public int rows;

        public ArraySizeException(int i, int j) {
            this.count = i;
            this.rows = j;
        }
    }
}
