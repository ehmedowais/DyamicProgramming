package com.ows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicSquareTest {

    @Test
    void getMinDiff() {
//        int[][] matrix = {{6,1,8},{7,5,3},{4,9,2}};
//        var r = MagicSquare.getMinDiff(matrix);
//        assertEquals(4, r.minDiff);
//        printMatrix(r.matrix);
        int[][] matrix2 = {{1,2,2},{4,5,6},{7,8,9}};
        var r2= MagicSquare.getMinDiff(matrix2);
        assertEquals(23, r2.minDiff);
        printMatrix(r2.matrix);
    }

    private void printMatrix(int[][] matrix) {
        for(int i=0; i< 3; i++) {
            for(int j=0; j< 3; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.print("\n");
        }
    }
}