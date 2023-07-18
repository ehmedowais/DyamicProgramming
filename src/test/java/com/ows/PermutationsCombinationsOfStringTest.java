package com.ows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsCombinationsOfStringTest {

    @Test
    void permutationsWhenRepetitionAllowed() {
        var x = PermutationsCombinationsOfString.permutation("abc","");
        assertEquals(6, x.size());
        var y = PermutationsCombinationsOfString.howManyPermutationsApperInString("cbabadcbbabbcbabaabccbabc","abbc");
        assertEquals(7,y);
    }
}