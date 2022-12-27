package com.miu.fpp.finalprep.pq;


public class q3 {
    private LNode head;
    private LNode tail;

    public boolean push(Object obj) {
        LNode newNode = new LNode(obj);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            LNode temp = head;
            head = newNode;
            head.next = temp;
        }
        return true;
    }

    public Object pop() {
        if (head == null) {
            System.out.println("Null Valuess");
            return null;
        }
        LNode popped = head;
        head = head.next;
        return popped.data;
    }

    public Object peek() {
        if (head == null) {
            System.out.println("Null Valuess");
            return null;
        }
        return head.data;
    }

    public static void main(String[] args) {
        q3 q3 = new q3();
        q3.push("Ajoke");
        q3.push("Benya");
        q3.push("Faridah");
        q3.push("Taiye");
        q3.push("Kehinde");

        System.out.println(q3.pop());
        System.out.println(q3.peek());
        System.out.println(q3.pop());
        System.out.println(q3.peek());

    }

}

class LNode {
    Object data;
    LNode next;

    public LNode(Object data) {
        this.data = data;
        this.next = null;
    }
}
