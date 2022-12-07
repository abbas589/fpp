package com.miu.fpp.lessonSix.p2.q5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Object> pets = new ArrayList<>();
        ArrayList<Cat> catArrayList = new ArrayList<>();
        ArrayList<Dog> dogArrayList = new ArrayList<>();


        Scanner sc = new Scanner(System.in);

        while (true) {
            int val;
            System.out.println("PETS LIST,\n\n1. Add Cat \n" +
                    "2. Add Dog\n" +
                    "3. Remove Cat\n" +
                    "4. Remove Dog\n" +
                    "5. Quit\n ");
            System.out.print("Select an option: ");
            val = sc.nextInt();
            if (val == 5) {
                break;
            }
            switch (val) {
                case 1:
                    System.out.println("Adding cat::::::::");
                    Cat cat = new Cat();
                    System.out.print("Enter Cat Name: ");
                    cat.setName(sc.next());
                    System.out.print("Enter Coat Color: ");
                    cat.setCoatColor(sc.next());
                    catArrayList.add(cat);
                    break;
                case 2:
                    System.out.println("Adding dog::::::::");
                    Dog dog = new Dog();
                    System.out.print("Enter Dog Name: ");
                    dog.setName(sc.next());
                    System.out.print("Enter Dog Weight: ");
                    dog.setWeight(sc.nextDouble());
                    dogArrayList.add(dog);
                    break;

                case 3:
                    System.out.print("Enter Cat Name you wan to remove: ");
                    catArrayList.removeIf(cat1 -> cat1.getName().equals(sc.next()));
                    break;
                case 4:
                    System.out.print("Enter Dog Name you wan to remove: ");
                    dogArrayList.removeIf(dog1 -> dog1.getName().equals(sc.next()));
                    break;
                default:
                    System.out.println("You Have entered an invalid input please try again...");

            }
        }


    }
}
