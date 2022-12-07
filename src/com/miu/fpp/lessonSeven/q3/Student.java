package com.miu.fpp.lessonSeven.q3;

import com.miu.fpp.lessonSeven.q1.City;

public class Student implements Comparable {
    private String lastName;
    private int idNumber;


    public Student(String lastName, int idNumber) {
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    @Override
    public int compareTo(Object o) {

        /*Sorting by ID number*/
//        Student student = (Student) o;
//        if (idNumber < student.idNumber) {
//            return -1;
//        } else if (idNumber > student.idNumber) {
//            return 1;
//        } else {
//            return 0;
//        }
//
        Student student = (Student) o;
         return lastName.compareTo(student.lastName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", idNumber=" + idNumber +
                '}';
    }
}
