package com.miu.fpp.lessonSeven.q3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Edet", 4));
        students.add(new Student("Abbas", 1));
        students.add(new Student("Jason", 5));
        students.add(new Student("Musa", 3));
        students.add(new Student("Mantu", 2));

        Collections.sort(students);

        System.out.println(students.toString());
    }
}
