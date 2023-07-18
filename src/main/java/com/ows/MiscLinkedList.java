package com.ows;

public class MiscLinkedList {
    /*reverse singly linked list*/
    public static LinkedNode reverseSinglyLinkedList(LinkedNode head){
        LinkedNode currNode, prevNode, nextNode;
        currNode = head;
        prevNode = head;
        while(currNode != null){
            nextNode = currNode.nextNode;
            currNode.nextNode= prevNode;
            prevNode = currNode;
            currNode = nextNode;



        }
        head.nextNode=null;
        return prevNode;
    }


    public static class LinkedNode {
        public LinkedNode(int val, LinkedNode nextNode) {
            this.val = val;
            this.nextNode = nextNode;
        }
        public int val;
        public LinkedNode nextNode;
    }
}
