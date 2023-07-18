package com.ows;

/*This class is to demonstrate the algorithm for reading a matrix in spiral way, means first you iterate row than
move to column and iterate till last row and keep moving till the first column than move up like in spiral fashion
* */
public class SpiralMatrix {
    public static Integer[] readMatrixSpiral(Integer[][] matrix) {
        var begRow = 0;
        var endRow = matrix.length -1;
        var begCol = 0;
        var endCol = matrix[begRow].length -1;
        var result  = new Integer[(endRow+1) * (endCol+1)];
        var k = 0;
        while(begRow <= endRow || begCol <= endCol) {
            for(int i= begCol; i <= endCol; i++) {
                result[k++] = matrix[begRow][i];
            }
            begRow++;
            for(int i = begRow; i <= endRow; i++) {
                result[k++] = matrix[i][endCol];
            }
            endCol--;
            for(int i= endCol; i >= begCol; i--) {
                result[k++] = matrix[endRow][i];
            }
            endRow--;
            for(int i = endRow; i >= begRow; i--) {
                result[k++] = matrix[i][begCol];
            }
            begCol++;
        }


        return result;
    }
}
