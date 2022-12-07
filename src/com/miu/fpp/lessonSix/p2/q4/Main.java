package com.miu.fpp.lessonSix.p2.q4;

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

        ArrayList<Dog> dogs = new ArrayList<>();
        for (Object obj : pets) {
            if (obj instanceof Dog ) {
                Dog dog = (Dog) obj;
                dogs.add(dog);
            }
        }

        //AVG,MIN,MAX DOG:
        double weightSum = 0.0;
        double weightMax = dogs.get(0).getWeight();
        double weightMin = dogs.get(0).getWeight();
        for (Dog d : dogs) {
            weightSum += d.getWeight();
            if (weightMax < d.getWeight()) {
                weightMax = d.getWeight();
            }
            if (weightMin > d.getWeight()) {
                weightMin = d.getWeight();
            }
        }
        System.out.println("Weight average is : " + weightSum / dogs.size());
        System.out.println("Weight Max is : " + weightMax);
        System.out.println("Weight Min is : " + weightMin);


    }
}
