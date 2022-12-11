package com.miu.fpp.lessonThree;

import java.util.Arrays;

public class QuestionThree {

    public static void main(String[] args) {

        int[] testArr1 = new int[]{1, 2, 13, 4, 5, 6, 0, 55, 24};
        Arrays.sort(testArr1);

        System.out.println("========CONFIRM ARRAY IS SORTED============");
        for (int a : testArr1) {
            System.out.print(a + ", ");
        }
        System.out.println("\n========CONFIRM ARRAY IS SORTED============");


        System.out.println("Checking for a value ---------------------------");
        int foundIndex = binarySearch(testArr1, 0, testArr1.length - 1, 13);
        if (foundIndex > 0) {
            System.out.println("Value was found at index: " + foundIndex);
        } else {
            System.out.println("Soorry we could not find the value inn the array");
        }
        System.out.println("Checking for a value ---------------------------");
    }


    public static int binarySearch(int[] arr, int left, int right, int val) {

        if (arr.length < 1) {
            return -1;
        }
        if (left <= right) {
            int mid = right - left / 2;
            System.out.println("mid index is :" + mid);
            if (arr[mid] == val) {
                return mid;
            }
            if (arr[mid] < val) {
                return binarySearch(arr, mid + 1, right, val);
            } else {
                return binarySearch(arr, left, mid - 1, val);
            }

        }

        return -1;
    }
}
