package com.miu.fpp.lessonThirteen.q2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Advice {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/advice.txt");

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

            Scanner scanner = new Scanner(bufferedInputStream);
            System.out.println("********************TODAY`S ADVICE********************");
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }

            System.out.println("Enter a new Advice for the next person: ");
            Scanner scInput = new Scanner(System.in);

            FileOutputStream fileOutputStream = new FileOutputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/advice.txt");

//            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            fileOutputStream.write(scInput.nextLine().getBytes());

            System.out.println("******************** ADVICE HAS BEEN UPDATED! THANK YOU ********************");

            fileOutputStream.flush();
            fileOutputStream.close();

            fileInputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
