package com.company;
import homework8.*;

import java.sql.Array;

public class Main {

    public static void main(String[] args) throws Exception {

        String[][] toCalc = {{"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}, {"1","2","3","4"}};

        try {
            System.out.println("Результат обчислення матриці розміром 4х4 - "+ArrayValueCalculator.doCalc(toCalc));
        } catch (ArrayValueCalculator.ArraySizeException ase) {
            System.out.println("get ArraySizeException with "+ase.count+" elements and "+ase.rows+" rows");
        } catch (ArrayValueCalculator.ArrayDataException ade) {
            System.out.println("get ArrayDataException on row "+ade.locationA+" column "+ade.locationB);
        }
    }
}

