package com.miu.fpp.lessonOne;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {

        System.out.println("*** Method That takes array of Strings & a String ***");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int lengthOfArray = sc.nextInt();


        while (lengthOfArray < 2) {
            System.out.println("Length of array should be greater than 1: ");
            System.out.println("Enter the Size of Array: ");
            lengthOfArray = sc.nextInt();
        }

        System.out.println("Enter the main String Value: ");
        String mainVal = sc.next();

        String[] vals = new String[lengthOfArray];

        System.out.println("Now we need to get the arrays of strings ");
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Enter the ["+(i+1)+"] String Value: ");
            vals[i] = sc.next();
        }

        boolean containsValue = containsValue(vals, mainVal);

        if (containsValue) {
            System.out.println("The String array contains the main String Value");
        } else {
            System.out.println("The String array DOES NOT contains the main Value");

        }


    }

    public static boolean containsValue(String[] vals, String mainValue) {
        boolean containsVal = false;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i].equals(mainValue)) {
                containsVal = true;
                break;
            }
        }
        return containsVal;
    }
}
