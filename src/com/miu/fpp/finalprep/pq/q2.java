package com.miu.fpp.finalprep.pq;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/finalprep/pq/q1.txt");
            BufferedInputStream bos = new BufferedInputStream(fis);
            Scanner fileScanner = new Scanner(fis);

            List<Student> students = new ArrayList<>();
            while (fileScanner.hasNext()){
                String val = fileScanner.nextLine();
                String[] vals = val.split("-");
                Student student = new Student();
                student.setFirstName(vals[0]);
                student.setLastName(vals[1]);
                int count = 0;
                for (int i = 2; i < vals.length; i++) {
                    student.setTotalScore(Integer.parseInt(vals[i]));
                    count++;
                }
                student.setAverage(student.getTotalScore()/count);
                students.add(student);
            }

            Student maxStudent = students.get(0);
            for (Student student: students) {
                if(student.getAverage() > maxStudent.getAverage()){
                    maxStudent = student;
                }
            }

            System.out.println("++++++++++MAX STUDENT REPORT+++++++++++");
            System.out.println("Name: "+maxStudent.getFirstName()+" :LastName :"+maxStudent.getLastName());
            System.out.println("Avg is: "+maxStudent.getAverage());

        }catch (IOException io){
            io.printStackTrace();
        }
    }

    static class Student {
        private String firstName;
        private String lastName;
        private double totalScore = 0;
        private double average = 0;


        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public double getAverage() {
            return average;
        }

        public double getTotalScore() {
            return totalScore;
        }

        public void setTotalScore(double totalScore) {
            this.totalScore += totalScore;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setAverage(double average) {
            this.average = average;
        }

        public String getFirstName() {
            return firstName;
        }
    }
}
