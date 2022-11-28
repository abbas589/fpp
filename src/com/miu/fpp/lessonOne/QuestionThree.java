package com.miu.fpp.lessonOne;

import java.util.Scanner;

public class QuestionThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int arrayLength = sc.nextInt();

        while (arrayLength < 2) {
            System.out.println("Length of array should be greater than 1: ");
            System.out.println("Enter the Size of Array: ");
            arrayLength = sc.nextInt();
        }

        int[] vals = new int[arrayLength];

        System.out.println("Enter the Values in the array");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter the " + (i + 1) + " Value in the Array :");
            vals[i] = sc.nextInt();
        }

        int evenCount = evenCount(vals);
        int oddCount = arrayLength - evenCount;
        System.out.println("Number of Even is :" + evenCount);
        System.out.println("Number of Odd is :" + oddCount);

    }

    public static int evenCount(int[] vals) {

        int evenCounter = 0;
        for (int val : vals) {
            if (val % 2 == 0) {
                evenCounter += 1;
            }

        }
        return evenCounter;

//        return (int) Arrays.stream(vals).filter(v -> v % 2 == 0).count();
    }

}
