package com.miu.fpp.lessonThirteen.q2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AvgNumber {
    public static void main(String[] args) {

        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/doublenumbers.txt");

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            Scanner scanner = new Scanner(bufferedInputStream);
            int totalNumbers = 0;
            double sumOfNumbers = 0.0;
            while (scanner.hasNext()) {
                sumOfNumbers += scanner.nextDouble();
                totalNumbers++;
            }

            double avg = sumOfNumbers / totalNumbers;
            System.out.println("the total numbers are: "+ sumOfNumbers);
            System.out.println("the total numbers count are: "+ totalNumbers);
            System.out.println("The average of the numbers in file: " + avg);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
