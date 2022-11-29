package com.miu.fpp.lessonTwo;

public class QuestionThree {
    static class Demo1 {
        public static void main(String[] args) {
            int i[] = new int[10];
            System.out.println(i[8]);
        }
    }
    static class Demo2{
        public static void main(String args[]) {
            QuestionTwo.Student students[] = new QuestionTwo.Student[10];
            System.out.println(students[5]);
        }
    }

    static class  Demo3{
        public static void main(String args[]) {
            QuestionTwo.Student students[] = new QuestionTwo.Student[10];
//            System.out.println(students[5].getName());
        }
    }
}


//::::::::::::::::::::::::
//ANSWERS
//::::::::::::::::::::::::


/*
*
*
* A -   The output of i[8] would be 0 since the value is empty.
* B -   The output of students[5] would be null.
* C -   There would be a compilation error, the getName() method does not exists, however, if we assume it exists, the response would be null.
*
*
*
* */