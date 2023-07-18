package com.ows;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MiscQuestions {
    /*This method counts the number of occurrences of a digit in array*/
    public static int maxCount(int[] nums) {
        if(nums.length <= 1) {
            return 1;
        }
        int maxOccurrance = 1;

        int curMax = 1;
        for(int num =1; num < nums.length; num++) {
           if(nums[num] == nums[num - 1]) {
               curMax++;
           }else {
               maxOccurrance = Math.max(maxOccurrance, curMax);
               curMax = 1;

           }
        }
        return Math.max(curMax,maxOccurrance);
    }
    public static long maxCountWithLambda(Integer[] array) {
        Map<Integer, Long> elementCounts = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        long maxCount = elementCounts.values().stream()
                .mapToLong(Long::intValue)
                .max()
                .orElse(0);

        return maxCount;

    }
    public static int[] insertAtCorrectLocation(int[] nums, int target) {
        if(nums.length == 1) {
            if(nums[0] < target) {
                return new int[] {nums[0], target};
            }else {
                return new int[] {target, nums[0]};
            }
        }

        int lPtr = 0;
        int rPtr = nums.length -1;
        int pivot = 0;


        var newArr = new int[nums.length +1];
        for(int i=0; i< newArr.length; i++) {
            if(i == pivot) {
                newArr[i] = target;
            }else {
                newArr[i] = nums[i];
            }
        }
        return newArr;
    }
    public static int findSmallestMissing(int[] A) {
        var set = new HashSet<Integer>();
        for(int i: A) {
            if(i > 0) {
                set.add(i);
            }
        }
        var minMissing = 1;
        while(set.contains(minMissing)) {
            minMissing++;
        }
        return minMissing;
    }
    public static int findDominatorIndex(int[] A) {
        Map<Integer, Long> map = Arrays.stream(A).boxed().collect(Collectors.groupingBy(i -> i,Collectors.counting()));
        var dominator = -1;
        for(Map.Entry<Integer, Long> entry: map.entrySet()) {
            if(entry.getValue() > A.length/2) {
                dominator = entry.getKey();
                break;
            }
        }
        for(int i =0; i< A.length; i++) {
            if(dominator == A[i]) {
                return i;
            }
        }
        return -1;
    }
    private static Map<String, Boolean> map = new HashMap<>();
    public static boolean  canFormString(String target, String[] strings) {

        if(target.length() == 0) return true;
        if(map.containsKey(target)) return true;
        for(String str: strings) {
            if(target.startsWith(str)) {
                var subTarget = target.substring(str.length());
                if(map.containsKey(subTarget)) {
                    return map.get(subTarget);
                }
                var result = canFormString(subTarget, strings);
                if(result) {
                    map.put(target, Boolean.TRUE);
                    return true;
                }
            }
        }
        map.put(target, Boolean.FALSE);
        return false;
    }
    public static int hoaManyWaysCanFormString(String target, String[] strings) {
        if(target.length() == 0) return 1;
        int totalCount = 0;
        for(String str: strings) {
            if(target.startsWith(str)) {
                var subStr = target.substring(str.length());
                var count = hoaManyWaysCanFormString(subStr, strings);
                if(count > 0) {
                    totalCount ++;
                }
            }
        }
        return totalCount;
    }
    /*Leetcode 277. Find if array contains duplicates. If array contains any duplicate it should return true or false else*/
    public static boolean hasDuplicates(int[] arr) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        for(int i : arr) {
            if(sortedSet.contains(i)) {
                return true;
            }else {
                sortedSet.add(i);
            }
        }
        return false;
    }
}
