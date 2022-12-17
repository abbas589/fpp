package com.miu.fpp.lessonThirteen.q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInput {
    public static void main(String[] args) {

        System.out.println("This program requires you to enter input from 0 - 100");

        try {

            Scanner sc = new Scanner(System.in);
            int value = sc.nextInt();

            if (value < 0 || value > 100)
                throw new UnsupportedOperationException();

        } catch (InputMismatchException ime) {
            System.out.println("Only numbers ranging from 0 - 100 are allowed.");
        } catch (UnsupportedOperationException uoe) {
            System.out.println("You have entered a number greater than 100 or less than 0");

        }

    }
}
