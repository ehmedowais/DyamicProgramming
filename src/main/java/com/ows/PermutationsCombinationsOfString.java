package com.ows;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

public class PermutationsCombinationsOfString {
    //example abc the possible number of permutations = abc, acb, bac, bca, cba, cab
    public static int howManyPermutationsApperInString(String source/*This is string in what we find permutations*/, String target) {
        var counter =new AtomicInteger(0);
        var set = permutation(target, "");
        set.forEach(item -> {
            if(source.contains(item)) {
                counter.incrementAndGet();
            }
        });
        return counter.get();
    }
    private static Set<String> retVal = new HashSet<>();
    public static Set<String> permutation(String str, String ans) {
        if(str.length() == 0) {
            retVal.add(ans);
            return retVal;
        }

        char charAtIndex;
        String restOfString = "";
        for(int i=0; i< str.length(); i++) {
            charAtIndex = str.charAt(i);
            restOfString = str.substring(0,i) + str.substring(i+1);
            retVal = permutation(restOfString, ans + charAtIndex);

        }
        return retVal;
    }
}
