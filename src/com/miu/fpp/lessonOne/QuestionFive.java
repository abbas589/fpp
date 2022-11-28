package com.miu.fpp.lessonOne;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {

        int[] arrValues = new int[3];

        Scanner scanner = new Scanner(System.in);

        System.out.println("We are calculating the max Value in an array");
        for (int i = 0; i < arrValues.length; i++) {
            System.out.println("Enter the first Value: ");
            arrValues[i] = scanner.nextInt();
        }
        int maxValue = maxFinder(arrValues);
        System.out.println("The Max Value is:  " + maxValue);
    }

    public static int maxFinder(int[] values) {
        int max = values[0];
        for (int i = 0; i < values.length; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }
}
