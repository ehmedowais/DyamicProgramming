package com.ows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubesOfFourNumbersTest {

    @Test
    void findPairsOfCubes() {
        var x = CubesOfFourNumbers.findPairsOfCubes(15);
        for(int i:x) {
            System.out.println(i);
        }
    }
}