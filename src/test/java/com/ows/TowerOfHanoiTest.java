package com.ows;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class TowerOfHanoiTest {

    @Test
    void play() {
        var a = new Stack<Integer>();
        a.push(4);
        a.push(3);
        a.push(2);
        a.push(1);
        var result = TowerOfHanoi.play(a);
        //System.out.println(a);
        while(!result.isEmpty())
            System.out.println(result.pop());
    }
}