package com.miu.fpp.lessonThree;

public class QuestionTwo {
    public static void main(String[] args) {
        char[] charArray = "akel".toCharArray();
        System.out.println("Min value in the char array is : "+minCharInArray(charArray,0,charArray.length -1));

    }

    public static char minCharInArray(char[] values, int lowerIndex, int upperIndex){
        char min;

        if(lowerIndex == upperIndex){
            return values[lowerIndex];
        } else {
            min = minCharInArray(values, lowerIndex+1, upperIndex);
            if((int) values[lowerIndex] <= (int) min){
                 min = values[lowerIndex];
            }
            return min;
        }
    }
}
