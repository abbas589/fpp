package com.miu.fpp.lessonSix.q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("PETS LIST, WE'LL BE ENTERING NAME OF PETS AND THE TYPE 'C' FOR CAT OR 'D' FOR DOG: ");
        Scanner sc = new Scanner(System.in);
        ;

        String val = "";
        while (true) {

            System.out.println("ENTER NAME: ");

            Pet pet = new Pet();
            val = sc.next();
            if (val.equals("STOP")) {
                break;
            }
            pet.setName(val);
            System.out.println("ENTER TYPE: ");
            char type = sc.next().charAt(0);
            if (type == 'c') {
                pet.setType("CAT");
            } else {
                pet.setType("DOG");
            }
            pets.add(pet);
        }

        System.out.println(pets.toString());
    }
}
