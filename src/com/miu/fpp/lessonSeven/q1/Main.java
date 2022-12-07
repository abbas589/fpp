package com.miu.fpp.lessonSeven.q1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        City[] cities = new City[5];

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter City Details");
        for (int i = 0; i < cities.length; i++) {
            System.out.print("Enter the " + (i + 1) + " City :");
            String cityName = sc.next();
            System.out.print("Enter the " + (i + 1) + " City Temp in Celsius :");
            double temp = sc.nextDouble();

            cities[i] = new City(cityName, temp);
        }

        Arrays.sort(cities);

        System.out.println(" :::::::::::::::Printing the sorted Array :::::::::::::::");

        System.out.println(Arrays.toString(cities));


    }
}
