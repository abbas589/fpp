package com.miu.fpp.lessonOne;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionTwo {
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

        int[] evenAndOddCount = evenAndOddCount(vals);
        System.out.println("Number of Even is :" + evenAndOddCount[0]);
        System.out.println("Number of Odd is :" + evenAndOddCount[1]);

    }

    public static int[] evenAndOddCount(int[] vals) {
        int[] oddEvenCounter = new int[2];
        int oddCount = 0;
        int evenCount = 0;

        for (int i = 0; i < vals.length; i++) {
            if (vals[i] % 2 == 0) {
                evenCount += 1;
            } else {
                oddCount += 1;
            }
        }
        oddEvenCounter[0] = evenCount;
        oddEvenCounter[1] = oddCount;

//        oddEvenCounter[0] = (int) Arrays.stream(vals).filter(v -> v % 2 == 0).count();
//        oddEvenCounter[1] = (int) Arrays.stream(vals).filter(v -> v % 2 != 0).count();
        return oddEvenCounter;
    }

}
