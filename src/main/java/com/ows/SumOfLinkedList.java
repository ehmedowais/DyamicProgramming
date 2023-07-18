package com.ows;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

/*In this class we are going to create a function that will return the sum of two linked lists. The task is to sum the
numbers for example one linked list is 2->3->4 the number becomes 432 and second linked list is 1->2->3 and the number
will be 321 and the sume of these two numbers will 753 and the final linked list will be 3->5->7
* */
public class SumOfLinkedList {
    public static LinkedList<Integer> sumLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        return intToLinkedList(listToNumber(list1) + listToNumber(list2));

    }

    private static Integer listToNumber(LinkedList<Integer> list) {
        AtomicReference<String> retVal = new AtomicReference<>("");
        list.descendingIterator().forEachRemaining(i -> retVal.updateAndGet(v -> v + i));
        return Integer.valueOf(retVal.get());
    }
    private static LinkedList<Integer> intToLinkedList(Integer number) {
        var x = new StringBuilder(number.toString());
        var y = x.reverse().toString().toCharArray();
        var responseList = new LinkedList<Integer>();
        for(char c: y) {
            responseList.add(Integer.valueOf(""+c));
        }
        return responseList;
    }
}
