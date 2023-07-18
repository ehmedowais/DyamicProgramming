package com.ows;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

class SumOfLinkedListTest {

    @Test
    void sumLists() {
        var list1 = new LinkedList<Integer>();
        var list2 = new LinkedList<Integer>();
        var result = new LinkedList<Integer>();
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(9);
        list1.add(0);
        list2.add(9);
        list2.add(9);
        list2.add(9);
        result.add(8);
        result.add(9);
        result.add(9);
        result.add(0);
        result.add(0);
        result.add(1);
        assertEquals(result,SumOfLinkedList.sumLists(list1, list2));
        var array = new ArrayList<Integer>();
        array.indexOf(35);


    }
}