package com.ows;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MiscQuestionsTest {
    @Test
    void maxCountTest() {
        assertEquals(4, MiscQuestions.maxCount(new int[]{1,2,2,2,2,3}));
        assertEquals(3, MiscQuestions.maxCount(new int[]{1,2,2,3,3,3}));

        assertEquals(4, MiscQuestions.maxCountWithLambda(new Integer[]{1,2,2,2,2,3}));
        assertEquals(3, MiscQuestions.maxCountWithLambda(new Integer[]{1,2,5,6,2,3,5,6,3,9,3,1}));
    }
    @Test
    void insertAtCorrectLocationTest() {
        var result = MiscQuestions.insertAtCorrectLocation(new int[]{1,2,3,5,6,7}, 4);
        assertTrue(true);
    }

    @Test
    void sampleJavaTest() {
        int[] A = new int[]{1, 3, 6, 4, 1, 2};
        assertEquals(5, MiscQuestions.findSmallestMissing(A));
    }
    @Test
    void findDominatorIndexTest() {
        int[] A = new int[]{1,3,2,3,5,3};
        assertEquals(-1, MiscQuestions.findDominatorIndex(A));
        A = new int[]{3,1,3,2,3,5,3,5,3};
        assertEquals(0, MiscQuestions.findDominatorIndex(A));
    }

    @Test
    void canFormStringTest() {
        assertTrue(MiscQuestions.canFormString("abcdef", new String[]{"ab","abc", "cd", "def", "abcd"}));
        assertFalse(MiscQuestions.canFormString("skateboard", new String[]{"bo","rd", "ate", "t", "ska","sk", "boar"}));
        assertTrue(MiscQuestions.canFormString("enterapotentpot", new String[]{"a","p","ent","enter", "ot","o","t"}));
        assertFalse(MiscQuestions.canFormString("eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeed", new String[]{"e","ee", "eee", "eeee", "eeeee","eeeeee", "eeeeeee"}));
    }

    @Test
    void hoaManyWaysCanFormStringTest() {
        assertEquals(2, MiscQuestions.hoaManyWaysCanFormString("purple", new String[]{"purp", "p", "ur", "le", "purpl"}));
    }
    @Test
    void hasDuplicatesTest() {
        assertTrue(MiscQuestions.hasDuplicates(new int[]{2,2,3,4,5,6,7,1}));
    }
}