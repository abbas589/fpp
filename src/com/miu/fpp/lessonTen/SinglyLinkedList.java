package com.miu.fpp.lessonTen;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //Represent the head and tail of the singly linked list
    public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if (head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        } else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }

    public boolean find(int n) {
        Node current = head;
        if (head == null) {
            return false;
        }

        while (current != null) {
            if (current.data == n) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean removeLast(int n) {

        Node tmp = head;
        if (tmp == null) {
            return false;
        }
        if(tmp.next == null){
            head = null;
            return true;
        }
        Node nextNode = tmp.next;

        while (tmp.next != null) {
            if(nextNode.next == null){
                tmp.next = null;
            }
            tmp = nextNode;
            nextNode = nextNode.next;
        }

        return false;
    }

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while (current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(4);
        list.addNode(3);
        list.display();

        list.addNode(6);
        list.addNode(9);
        list.addNode(11);
        list.addNode(2);
        list.addNode(4);
        list.display();
        list.removeLast(6);
        list.display();
    }


}
