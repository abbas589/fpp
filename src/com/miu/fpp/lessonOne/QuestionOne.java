package com.miu.fpp.lessonOne;

import java.util.Scanner;

public class QuestionOne {
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

        double averageVal = average(vals);

        System.out.println(" The Average is : " + averageVal);


    }

    public static double average(int[] vals) {
        double sum = 0.0;
        for (int val : vals) {
            sum += val;
        }


        return sum / vals.length;

//        return Arrays.stream(vals).average().orElse(0.0);
    }
}
