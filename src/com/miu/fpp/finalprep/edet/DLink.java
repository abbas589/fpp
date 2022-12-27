package com.miu.fpp.finalprep.edet;

import java.util.Collections;

public class DLink {
    public DNode head;
    public DNode tail;


    public DLink() {
        head = new DNode(null, null, null);
    }

    public void add(int n) {
        DNode dNode = new DNode(n);
        if (head.next == null) {
            head.next = dNode;
            head.next.previous = head;
        } else {
            DNode val = head;
            while (val.next != null) {
                val = val.next;
            }
            val.next = dNode;
            dNode.previous = val;
        }
    }

    public static void main(String[] args) {
        DLink dLink = new DLink();
        dLink.add(10);
        dLink.add(20);

        System.out.println(sum(dLink.head));

        System.out.println(min(dLink.head));


    }

    private static int sum(DNode head) {
        if (head.next == null) {
            return 0;
        }
        return head.next.value + sum(head.next);
    }

    private static int min(DNode node) {

        if (node.next == null) {
            return 0;
        } else {
            int mini = min(node.next);
            if (node.next.value > mini) {
                return mini;
            } else {
                return node.next.value;
            }
        }
    }
}

class DNode {
    Integer value;
    DNode next;
    DNode previous;

    public DNode(int n) {
        this(n, null, null);
    }

    public DNode(Integer n, DNode next, DNode previous) {
        this.value = n;
        this.next = next;
        this.previous = previous;
    }

}
