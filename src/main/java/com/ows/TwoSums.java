package com.ows;

import java.util.Arrays;

/*Leetcode 167. In this function we need to find two numbers from array that adds up to target
* */
public class TwoSums {
    public static int[] findTwoSumsBruteForce(int[] arr, int target) {
        for(int i =0; i< arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
    public static int[] findTwoSums(int[] arr, int target) {
        int lPtr = 0;
        int rPtr = arr.length -1;
        while(lPtr < rPtr) {
            var sum = arr[rPtr] + arr[lPtr];
            if( sum == target) {
                return new int[] {lPtr+1, rPtr +1};
            }else if(sum < target) {
                lPtr ++;
            }else {
                rPtr --;
            }
        }
        return new int[]{lPtr, rPtr};
    }
}
