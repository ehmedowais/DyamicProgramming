package com.ows;

public class BinaryGap {
    public static int longestSequenceOfZeros(String  binary) {
        var maxLength =0;
        var curLength =0;
        var foundOne = false;

        for(char c : binary.toCharArray()) {
            if(c == '0') {

                if(foundOne) {
                    curLength ++;
                }
            }else {
                maxLength = Math.max(curLength, maxLength);
                curLength = 0;
                foundOne = true;
            }
        }
        return  maxLength;
    }


}
