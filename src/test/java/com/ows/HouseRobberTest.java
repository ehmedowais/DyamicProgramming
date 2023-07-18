package com.ows;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HouseRobberTest {

    @Test
    void getMaxLoot() {
        var houses = List.of(2,7,3,1,4,2,1,8);
        assertEquals(19, HouseRobber.getMaxLoot(houses));
        houses = List.of(2,1,1,2);
        assertEquals(4, HouseRobber.getMaxLoot(houses));
        houses=List.of(1,7,8,8);
        assertEquals(15, HouseRobber.getMaxLoot(houses));
    }

    @Test
    void getMaxCircularLoot() {
        var houses = List.of(2,7,3,8,15);
        assertEquals(22, HouseRobber.getMaxLoot(houses));

    }
}