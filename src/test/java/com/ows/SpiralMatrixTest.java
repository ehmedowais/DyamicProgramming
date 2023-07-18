package com.ows;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

class SpiralMatrixTest {

    @Test
    void readMatrixSpiral() {
        Integer[][] myArray = new Integer[5][4];
        int count = 0;

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 4; j++) {
                myArray[i][j] = count++;
            }
        }
        var result = SpiralMatrix.readMatrixSpiral(myArray);
        for(int i=0; i< 20; i++) {
            out.println(result[i]);
        }
    }
}