package com.miu.fpp.lessonEight.taskE;

import java.util.Arrays;
import java.util.Comparator;

public class TaskEMain {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        Arrays.sort(data, (o1, o2) -> o1.getHireDate().compareTo(o2.getHireDate()));

        System.out.println("Printing sorted Array......");
        System.out.println(Arrays.toString(data));

    }
}
