package com.ows;

import java.util.HashMap;

/* In this class we will try to make a solution for a^3 + b^3 == c^3 + d^3
* */
public class CubesOfFourNumbers {
    public static int[] findPairsOfCubes(int limit) {
        var x = new int[4];
        var leftMap = new HashMap<Double, String>();
        var rightMap = new HashMap<Double, String>();
        for(int a=1; a<= limit; a++) {
            for(int b=1; b<= limit; b++) {
                leftMap.put(Math.pow(a,3) + Math.pow(b,3), a+","+b);
            }
        }
        for(int a=1; a<= limit; a++) {
            for(int b=1; b<= limit; b++) {
                if(leftMap.containsKey(Math.pow(a,3) + Math.pow(b,3))) {
                    System.out.println(leftMap.get(Math.pow(a,3) + Math.pow(b,3))+ "," + a+","+b);
                }
            }
        }
        return x;
    }
}
