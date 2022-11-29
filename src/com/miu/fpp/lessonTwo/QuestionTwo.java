package com.miu.fpp.lessonTwo;

public class QuestionTwo {

    public static class College {
        public static void main(String[] args) {
            Student[] student = new Student[2];
            student[0] = new Student();
            student[0].name = "Khan";
            student[0] = new Student();
            student[0].name = "Kittu";
            student[1] = new Student();
            student[1].name = "Munna";
            for (Student element : student) {
                System.out.print(element.name + " ~ ");
            }
        }
    }

    static class Student {
        String name;
    }
}

//ANSWERSS::::::::::::::::::::
/*
*
* The output of this would be Kittu ~ Muna ~
*
* */