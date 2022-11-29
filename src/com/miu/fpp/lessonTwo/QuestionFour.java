package com.miu.fpp.lessonTwo;


public class QuestionFour {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 4, -9, 33, 19, 78, 5};

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
        }

        System.out.println("Min Number is :" + min);
        System.out.println("Max Number is :" + max);

    }

}
