package com.miu.fpp.lessonSix.p2.q3;

import com.miu.fpp.lessonSix.p2.q1.Pet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> pets = new ArrayList<>();

        System.out.println("PETS LIST, WE'LL BE ENTERING NAME OF PETS AND THE TYPE 'C' FOR CAT OR 'D' FOR DOG: ");
        Scanner sc = new Scanner(System.in);
        ;

        String name = "";
        String petType = "";
        while (true) {

            System.out.println("ENTER NAME: ");

            name = sc.next();
            if (name.equals("STOP")) {
                break;
            }
            System.out.println("ENTER TYPE: ");
            char type = sc.next().charAt(0);

            if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.println("ENTER COAT COLOR: ");
                cat.setCoatColor(sc.next());

                pets.add(cat);
            } else {
                Dog dog = new Dog();
                dog.setName(name);

                System.out.println("ENTER DOG WEIGHT: ");
                dog.setWeight(sc.nextDouble());
                pets.add(dog);
            }

        }

        for (Object obj : pets) {
            if (obj instanceof Dog) {
                Dog dog = (Dog) obj;
                System.out.println(dog.toString());
            } else {
                Cat cat = (Cat) obj;
                System.out.println(cat.toString());
            }
        }

    }
}
