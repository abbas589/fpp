package com.miu.fpp.lessonThirteen.q3;

public class ArrayQueueTest {
    public static void main(String[] args) {
        ArrayQueueImpl arrayQueue = new ArrayQueueImpl();
        arrayQueue.enqueue(45);
        arrayQueue.enqueue(55);
        arrayQueue.enqueue(65);
        arrayQueue.enqueue(75);
        arrayQueue.enqueue(85);
        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.dequeue());
        System.out.println(arrayQueue.peek());
        System.out.println(arrayQueue.size());
        System.out.println(arrayQueue.isEmpty());
    }
}
