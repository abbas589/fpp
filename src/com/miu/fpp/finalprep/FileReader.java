package com.miu.fpp.finalprep;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class FileReader {
    public static void main(String[] args) {

        String s = "";
        try {
            FileInputStream fis = new FileInputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/advice.txt");

            BufferedInputStream bfs = new BufferedInputStream(fis);

            int i = 0;
            while ((i = bfs.read()) != -1) {
                s += (char) i;
            }

            bfs.close();
            fis.close();

            Vector objects = new Vector();
            objects.add("hello1");
            objects.add("hello2");
            Enumeration elements = objects.elements();

            SequenceInputStream sequenceInputStream = new SequenceInputStream(elements);
            BufferedInputStream bis = new BufferedInputStream(sequenceInputStream);

            int j = 0;

            while ((j = bfs.read()) != -1) {
                s += (char) j;
            }



            FileOutputStream fos = new FileOutputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/bazzcheket.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(s.getBytes());
            bos.flush();
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("File Read: " + s);
        }
    }
}
