package com.miu.fpp.lessonThirteen.q2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberCounter {
    public static void main(String[] args) {

        final int occuranceNumber = 10;
        int numberOfOccurance = 0;
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/numbers.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);


            Scanner scanner = new Scanner(bufferedInputStream);
            while (scanner.hasNext()){
                int number  = scanner.nextInt();
                if(occuranceNumber == number){
                    numberOfOccurance++;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.printf("Total occurrence of the number %d is : %d%n",occuranceNumber,numberOfOccurance);
    }


}
