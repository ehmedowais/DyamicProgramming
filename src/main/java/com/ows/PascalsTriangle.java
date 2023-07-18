package com.ows;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static ArrayList<ArrayList<Integer>> getPascalsTriangle(int rows) {
        var matrix = new ArrayList<ArrayList<Integer>>();
        matrix.add(new ArrayList<>());
        matrix.get(0).add(1);
        for(int i=1;i<rows;i++) {
            var row = new ArrayList<Integer>();
            row.add(1);
            for(int j=1;j<i;j++) {
                var x=0;
                var y=0;

                x= matrix.get(i - 1).get(j - 1);
                y= matrix.get(i - 1).get(j );
                row.add(x +  y );
            }
            row.add(1);
            matrix.add(row);
        }

        return matrix;
    }
}
