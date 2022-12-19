package com.miu.fpp.lessonThirteen.q3;

public class ArrayQueueImpl {
    private int[] arr = new int[2];
    private int front = -1;
    private int rear = 0;


    public int peek() {
        if(size() <= 0){
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
//implement
    }

    public void enqueue(int obj) {
        if (rear == arr.length - 1) {
            resize();
        }
        arr[rear] = obj;
        if (rear == 0) {
            front = rear;
        }
        rear++;
//implement
    }

    public int dequeue() {

        if (size() <= 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int removedVal = arr[front];
        front++;
        return removedVal;

//        return -1;
//implement
    }

    public boolean isEmpty() {
//implement
        if(front < 0){
            return true;
        }

        return rear - front <= 0;
    }

    public int size() {
//implement
        if(front < 0){
            return 0;
        }

        return rear - front;
    }

    private void resize() {
        int newArraySize = arr.length * 2;
        int[] newArray = new int[newArraySize];
        System.arraycopy(arr, 0, newArray, 0, arr.length);
        arr = newArray;
//implement
    }
}
