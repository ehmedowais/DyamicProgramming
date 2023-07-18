package com.ows;

import java.util.Stack;

public class TowerOfHanoi {
    public static Stack<Integer> play(Stack<Integer> a) {
        var b = new Stack<Integer>();
        var c = new Stack<Integer>();

        while(!a.empty()) {
            if(!a.empty()) c.push(a.pop());
            if(!a.empty()) b.push(a.pop());
            if(!c.empty()) b.push(c.pop());
            if(!a.empty()) c.push(a.pop());
            if(!b.empty()) a.push(b.pop());
            if(!b.empty()) c.push(b.pop());
            if(!a.empty()) c.push(a.pop());



        }

        return c;
    }
}
