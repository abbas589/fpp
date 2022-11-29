package com.miu.fpp.lessonTwo;

public class QuestionOne {
    public static void main(String[] args) {

    }

//    public int searchAccount(int[15] number ) {
//        number = new int[15];
//        for (int i = 0; i < number.length; i++ )
//            number[i] = number[i-1] + number[i+1];
//        return number;
//
//    }
}


//ANSWERS:::::::::::::::::::

/*
* 1 - The method argument has a length in the array, this is wrong. (Methods should only have the expected data type)
* 2 - In the for loop, the iteration starts at index 0, and there's an implementation that subtracts 1 from the current value, this will cause an index out of bound exception, same with the number[i+1]
* 3 - The method expects a return Type of int, however, the method implementation returns an array of int.
*
*
* */