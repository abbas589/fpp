package com.miu.fpp.lessonThree;

public class QuestionOne {

    public static class Exponential {
        public static void main(String[] args) {
            System.out.println(power(2, 10));
            System.out.println(power(2, 3));
        }


        public static double power(double x, int n) {
            if (n < 1) {
                return 1;
            }
            return x * power(x, n - 1);
        }

    }

}
