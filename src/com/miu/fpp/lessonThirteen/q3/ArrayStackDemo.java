package com.miu.fpp.lessonThirteen.q3;


interface Stack1 {
    public void push(Object ob);

    public Object pop();

    public Object peek();

    public boolean isEmpty();

    public int size();
}

class Node {
    public Object data;
    public Node next;

    Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

class ArrayStack implements Stack1 {


    private Object a[];
    private int top; // stack top

    private Node header;
    private Node tail;

//    public ArrayStack(int n) // constructor
//    {
////        a = new Object[n]; // create stack array
////        top = -1; // no items in the stack
//
////        Node node = new Node(n);
//
//    }

    public void push(Object item) // add an item on top of stack
    {
//        if (top == a.length - 1) {
//            System.out.println("Stack is full");
//            return;
//        }
//        top++; // increment top
//        a[top] = item; // insert an item

        Node newNode = new Node(item);

        if (header == null) {
            header = newNode;
            tail = newNode;
            return;
        }
        Node currentHeader = header;
        header = newNode;
        header.next = currentHeader;

    }

    public Object pop() // remove an item from top of stack
    {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
//        Object item = a[top]; // access top item
//        top--; // decrement top
//        return item;
         Node topNode = header;
         header = header.next;
         return topNode.data;

    }

    public Object peek() // get top item of stack
    {
        if (isEmpty())
            return null;
//        return a[top];
        return header.data;
    }

    public boolean isEmpty() // true if stack is empty
    {
//        return (top == -1);
        return header == null;
    }

    public int size() // returns number of items in the stack
    {
//        return top + 1;
        int count = 0;
        if(isEmpty()){
            return 0;
        }
        Node current = header;
        while (current.next!=null){
            current = current.next;
            count++;
        }
        return count;
    }
}

public class ArrayStackDemo {
    public static void main(String[] args) {


        ArrayStack stk = new ArrayStack(); // create stack of size 4
        Object item;
        stk.push('A'); // push 3 items onto stack
        stk.push('B');
        stk.push('C');
        stk.push('D');

        System.out.println("size(): " + stk.size());
        item = stk.pop(); // delete item
        System.out.println(item + " is deleted");
        stk.push('D'); // add three more items to the stack
        stk.push('E');
        System.out.println(stk.pop() + " is deleted");
        stk.push('G'); // push one item
        item = stk.peek(); // get top item from the stack
        System.out.println(item + " is on top of stack");
        System.out.println("Size of the Stack : " + stk.size());
        ArrayStack stk1 = new ArrayStack();
        stk1.push("Java");
        stk1.push(20);
        stk1.push(30);
        item = stk1.peek(); // get top item from the stack
        System.out.println(item + " is on top of stack");
    }

}
