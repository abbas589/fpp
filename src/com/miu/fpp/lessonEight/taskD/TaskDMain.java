package com.miu.fpp.lessonEight.taskD;

import java.util.Arrays;
import java.util.Comparator;

public class TaskDMain {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        Arrays.sort(data, new Comparator<DeptEmployee>() {
            @Override
            public int compare(DeptEmployee o1, DeptEmployee o2) {
                return o2.getName().compareTo(o1.getName());
            }
        });

        System.out.println("Printing sorted Array......");
        System.out.println(Arrays.toString(data));

    }
}
