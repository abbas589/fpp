package com.miu.fpp.lessonEight.taskA;

import java.util.Arrays;

public class TaskAMain {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        Arrays.sort(data, new NameComparator());

        System.out.println("Printing sorted Array......");
        System.out.println(Arrays.toString(data));
    }
}
