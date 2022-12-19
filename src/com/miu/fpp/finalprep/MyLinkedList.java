package com.miu.fpp.finalprep;

public class MyLinkedList {

    static class Node {
        private String data;
        private Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void addNode(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;

        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node tempNode = head;
            head = newNode;
            head.next = tempNode;
        }

    }

    public boolean deleteNode(String data) {

        boolean nodeDeleted = false;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            if (head.data.equals(data)) {
                head = head.next;
                return true;
            }

            Node current = head;
            while (current.next != null) {
                if (current.next.data.equals(data)) {
                    current.next = current.next.next;
                    nodeDeleted = true;
                    break;
                }
                current = current.next;

            }
        }
        return nodeDeleted;
    }


    public void printNode() {
        if (head == null) {
            System.out.println("Your linked list is empty!");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }


    }

}
