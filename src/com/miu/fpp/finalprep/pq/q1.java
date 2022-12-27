package com.miu.fpp.finalprep.pq;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class q1 {
    public static void saveToFile() {
        System.out.println("We`re going to save file to your PC");

        String val = " ";
        String inputs = "";

        while (!val.equals("-1")) {
            Scanner sc = new Scanner(System.in);
            val = sc.nextLine();
            System.out.println("val is: " + val);
            if (!val.equals("-1"))
                inputs = inputs + "\n" + val;
        }

        try {
            FileOutputStream fos = new FileOutputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/finalprep/pq/q1.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(inputs.getBytes());
            bos.flush();
            bos.close();
            fos.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }

    public static void main(String[] args) {
        saveToFile();
    }
}
