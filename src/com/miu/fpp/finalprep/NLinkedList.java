package com.miu.fpp.finalprep;

public class NLinkedList {
     NNode head;
     NNode tail;


    public boolean insert(Object data) {
        if (head == null) {
            head = new NNode(data);
            tail = head;
            return true;
        }
//        NNode val = head;
//        while (val.next != null) {
//            val = val.next;
//        }
//        val.next = new NNode(data);
//        return true;
        NNode newNode = new NNode(data);
        tail.next = newNode;
        tail = newNode;
        return true;
    }
}

class NNode {
    public Object data;
    public NNode next;

    public NNode(Object data, NNode next) {
        this.data = data;
        this.next = next;
    }

    public NNode(Object data) {
        this(data, null);
    }

}
