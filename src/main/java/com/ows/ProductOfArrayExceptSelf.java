package com.ows;

import java.util.HashMap;
import java.util.stream.Stream;

public class ProductOfArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        var map = new HashMap<Integer,Integer>();
        map.put(0,nums[0]);
        for(int i=1; i<nums.length; i++) {
            map.put(i, map.get(i-1)*nums[i]);
        }
        int[] result = new int[nums.length];
        var lastVal = map.get(nums.length -1);
        result[0] = lastVal / map.get(0);
        for(int i=1; i< result.length; i++) {
            result[i] = map.get(i-1) * (lastVal / map.get(i));
        }
        return result;
    }
}
