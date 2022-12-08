package com.miu.fpp.lessonEight.taskB;

import java.util.Arrays;

public class TaskBMain {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        Arrays.sort(data, new DeptEmployeeData.Sorter());

        System.out.println("Printing sorted Array......");
        System.out.println(Arrays.toString(data));

    }

}
