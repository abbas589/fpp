package com.miu.fpp.lessonEight.taskC;

import java.util.Arrays;
import java.util.Comparator;

public class TaskCMain {
    public static void main(String[] args) {
        DeptEmployee[] data = DeptEmployeeData.getDeptData();

        TaskCMain.listSorter(data);

        System.out.println("Printing sorted Array......");
        System.out.println(Arrays.toString(data));


    }

    public static void listSorter(DeptEmployee[] data) {
        class Sorter implements Comparator<DeptEmployee> {
            @Override
            public int compare(DeptEmployee o1, DeptEmployee o2) {
                return Double.compare(o2.getSalary(), o1.getSalary());
            }
        }
        Arrays.sort(data, new Sorter());
    }

}
