package com.miu.fpp.lessonTwo;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionNine {
    public static void main(String[] args) {

        String val = "";


        System.out.println("We're taking your DNA / RNA Sequence and outputinng your condone here...\n You need to enter a correct condone to avoid loss of data:");
        System.out.println("Enter Condone: ");
        Scanner scanner = new Scanner(System.in);
        val = scanner.nextLine();

        do {
            ArrayList<String> condone = new ArrayList<>();

            for (int i = 0; i < val.length(); i += 3) {
                String newVal = val.substring(i, Math.min(val.length(), i + 3));
                if (newVal.length() == 3) {
                    condone.add(newVal);
                }
            }

            for (String dna : condone) {
                System.out.println(dna);
            }

            System.out.println("Enter Condone: ");
            val = scanner.nextLine();

        } while (val.isEmpty() || !val.equals(" "));
    }
}
