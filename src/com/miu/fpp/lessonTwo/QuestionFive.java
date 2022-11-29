package com.miu.fpp.lessonTwo;

public class QuestionFive {
    public static void main(String[] args) {

        System.out.println("Check if Array 1 is Equal : " +isArrayEqual(new int[]{1,3,5,7},new int[]{1,3,5,7}));
        System.out.println("Check if Array 2 is Equal : " +isArrayEqual(new int[]{1,3,5,7},new int[]{2,4,6,8}));

    }

    public static boolean isArrayEqual(int[] firstArray, int[] secondArray) {
        boolean isEqual = true;
        if (firstArray.length != secondArray.length) {
            return false;
        }
        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray.length; j++) {
                if (firstArray[i] != secondArray[i]) {
                    isEqual = false;
                    break;
                }
            }
            if (!isEqual) {
                break;
            }
        }
        return isEqual;
    }
}
