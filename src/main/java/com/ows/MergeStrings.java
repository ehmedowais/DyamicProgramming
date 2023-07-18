package com.ows;

public class MergeStrings {
    public static String mergeAlternately(String word1, String word2) {
        var ar1 = word1.toCharArray();
        var ar2 = word2.toCharArray();
        var strBuilder = new StringBuilder();
        var longerArr = word1.length() > word2.length() ? ar1 : ar2;
        var endIndex = word1.length() > word2.length() ? word2.length() : word1.length();
        int i=0;
        for(;i<endIndex; i++) {
            strBuilder.append(ar1[i]);
            strBuilder.append(ar2[i]);
        }
        for(;i<longerArr.length; i++) {
            strBuilder.append(longerArr[i]);
        }
        return strBuilder.toString();
    }
}
