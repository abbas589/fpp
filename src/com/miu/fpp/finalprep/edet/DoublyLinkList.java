package com.miu.fpp.finalprep.edet;

public class DoublyLinkList {
    private Node head; // head of the list
    private Node tail; // tail of the list

    // Node class
    private class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Constructor
    public DoublyLinkList() {
        head = null;
        tail = null;
    }

    // Method to sort the list in descending order
    public void sort() {
        Node current = head;
        while (current != null) {
            Node next = current.next;
            while (next != null) {
                if (current.data < next.data) {
                    int temp = current.data;
                    current.data = next.data;
                    next.data = temp;
                }
                next = next.next;
            }
            current = current.next;
        }
    }

    // Method to add a new node to the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Method to display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkList list = new DoublyLinkList();
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(7);
        list.sort();
        list.display();
    }
}
