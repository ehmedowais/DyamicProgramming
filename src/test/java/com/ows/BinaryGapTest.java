package com.ows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryGapTest {

    @Test
    void longestSequenceOfZeros() {
        assertEquals(0, BinaryGap.longestSequenceOfZeros("100"));
        assertEquals(3, BinaryGap.longestSequenceOfZeros("10010001"));
    }
}