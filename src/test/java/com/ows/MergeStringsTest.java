package com.ows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeStringsTest {

    @Test
    void mergeAlternately() {
        assertEquals("apbqcr", MergeStrings.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", MergeStrings.mergeAlternately("ab","pqrs"));
        assertEquals("apbqcd", MergeStrings.mergeAlternately("abcd","pq"));
    }
}