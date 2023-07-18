package com.ows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MiscLinkedListTest {

    @Test
    void reverseSinglyLinkedList() {
        var linkedHead = new MiscLinkedList.LinkedNode(1,
                new MiscLinkedList.LinkedNode(2,
                        new MiscLinkedList.LinkedNode(3, new MiscLinkedList.LinkedNode(4,null))));
        var response = MiscLinkedList.reverseSinglyLinkedList(linkedHead);
        while (response != null) {
            System.out.println(response.val);
            response=response.nextNode;
        }
    }
}