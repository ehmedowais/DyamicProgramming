package com.ows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumsTest {

    @Test
    void findTwoSums() {
        assertEquals(1, TwoSums.findTwoSums(new int[]{2,7,11,17,43}, 9)[0]);
        assertEquals(2, TwoSums.findTwoSums(new int[]{2,7,11,17,43}, 9)[1]);
    }
}