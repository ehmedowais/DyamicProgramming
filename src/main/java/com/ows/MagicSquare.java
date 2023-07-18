package com.ows;

import static java.lang.Math.abs;
import static java.lang.Math.min;

/*A magic square is the matrix where sum of all rows columns and even diagonals is 15
* */
public class MagicSquare {
    private static int[][][] squares = {
            {{8,1,6},{3,5,7},{4,9,2}},
            {{2,9,4},{7,5,3},{6,1,8}},
            {{6,1,8},{7,5,3},{2,9,4}},
            {{8,3,4},{1,5,9},{6,7,2}},
            {{6,7,2},{1,5,9},{8,3,4}},
            {{4,3,8},{9,5,1},{2,7,6}},
            {{4,9,2},{3,5,7},{8,1,6}},
            {{2,7,6},{9,5,1},{4,3,8}}
    };
    static Result r = new Result();
    public static Result getMinDiff(int[][] matrix) {
        int tempDiff=Integer.MAX_VALUE;

        for(int i=0; i< 8; i++) {
            tempDiff = min(tempDiff, diffMatrices(matrix, squares[i]));
            r.setResult(tempDiff, squares[i]);
        }
        return r;
    }
    private static int diffMatrices(int[][] a, int[][] b) {
        int diff = 0;
        for(int i=0;i< 3; i++) {
            for(int j =0; j< 3;j++) {
                diff += abs( a[i][j] - b[i][j]);
            }
        }
        return diff;
    }
    public static class Result {
        int minDiff = Integer.MAX_VALUE;
        int[][] matrix = new int[3][3];
        public void setResult(int m, int[][] mn) {
            if(m < minDiff) {
                minDiff = m;
                for(int i=0; i< 3; i++) {
                    for(int j=0; j< 3; j++) {
                        matrix[i][j] = mn[i][j];
                    }

                }
            }
        }
    }
}
