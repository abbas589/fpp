package com.miu.fpp.lessonThirteen.q2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class PalindromeReader {
    public static void main(String[] args) {
        try {

            FileInputStream fileInputStream = new FileInputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/WordBuff.txt");

            BufferedInputStream bf = new BufferedInputStream(fileInputStream);

            int i;
            StringBuilder val = new StringBuilder();
            while ((i = bf.read()) != -1) {
                if ((char) i != '\n')
                    val.append((char) i);
            }

            int numberOfReversed = 0;
            String[] words = val.toString().split(",");
            for (String word : words) {
                if (word.equals(reverseString(word))) {
                    numberOfReversed++;
                } else {
                    System.out.println("Words that didnnt reverse:  " + word);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String reverseString(String val) {
        System.out.println("val reversinng is : " + val);
        String reversed = "";
        for (int i = val.length() - 1; i >= 0; i--) {
            reversed += val.charAt(i);
        }
        return reversed;
    }
}
