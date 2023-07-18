package com.ows;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {

    @Test
    void getPascalsTriangle() {
        assertEquals(List.of(List.of(1),List.of(1,1), List.of(1,2,1),List.of(1,3,3,1)), PascalsTriangle.getPascalsTriangle(4));
    }
}