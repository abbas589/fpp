package com.miu.fpp.lessonOne;

import java.util.Scanner;

public class QuestionSix {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int arrayLength = sc.nextInt();

        while (arrayLength < 2) {
            System.out.println("Length of array should be greater than 1: ");
            System.out.println("Enter the Size of Array: ");
            arrayLength = sc.nextInt();
        }

        String[] vals = new String[arrayLength];

        System.out.println("Enter the Values in the array");
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter the " + (i + 1) + " Value in the Array :");
            vals[i] = sc.next();
        }
        String[] reverseArrayValue = reverseArrayValue(vals);
        System.out.println("The Values in the reversed array are: ");
        for (String s : reverseArrayValue) {
            System.out.println(s);
        }

    }

    public static String[] reverseArrayValue(String[] vals) {
        String[] reversedArray = new String[vals.length];

        for (int i = 0; i < vals.length; i++) {
            char[] charVal = vals[i].toCharArray();
            StringBuilder updatedVal = new StringBuilder();
            for (int j = charVal.length - 1; j >= 0; j--) {
                updatedVal.append(charVal[j]);
            }
            reversedArray[i] = updatedVal.toString();
        }

        return reversedArray;

    }
}
