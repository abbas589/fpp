package com.miu.fpp.lessonTwo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class QuestionEight {

    public static void main(String[] args) {


        ArrayList<String> fortunes = new ArrayList<>();
        fortunes.add("You will get 4.0 GPA this semester.");
        fortunes.add("Happiness is programming.");
        fortunes.add("Satisfaction follows hard work.");
        fortunes.add("Patience is virtue.");

        char response;
        do {
            System.out.println("*****WELCOME TO BAZZ FORTUNE TELLING PROGRAM!!******");
            System.out.print("Fortune (Y/N)?: ");
            Scanner scanner = new Scanner(System.in);
            response = scanner.next().charAt(0);

            if (response != 'y' && response != 'Y' && response != 'n' && response != 'N') {
                System.out.println("You entered an invalid Response! ");
                break;
            }
            System.out.println("Today's Fortue!...............");
            System.out.println("_____________________________________________");
            System.out.println(fortunes.get(new Random().nextInt(fortunes.size())));
            System.out.println("_____________________________________________");

        } while (response == 'y' || response == 'Y');

        System.out.println("Thank you for stopping By! ");
    }
}
