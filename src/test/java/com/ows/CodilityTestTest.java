package com.ows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CodilityTestTest {

    @Test
    void potHoleSolution() {
        //assertEquals(2, CodilityTest.potHoleSolution("x...x" , "..x.."));
        assertEquals(4, CodilityTest.potHoleSolution("..xx.x.", "x.x.x.."));
    }
}