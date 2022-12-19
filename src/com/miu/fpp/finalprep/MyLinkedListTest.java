package com.miu.fpp.finalprep;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addNode("Salim");
        myLinkedList.addNode("Saidu");
        myLinkedList.addNode("Main");
        myLinkedList.addNode("Ajoke");
        myLinkedList.addNode("Musa");
//        myLinkedList.addFirst("Edet");

        System.out.println(myLinkedList.deleteNode("Main"));

        myLinkedList.printNode();
    }

}
