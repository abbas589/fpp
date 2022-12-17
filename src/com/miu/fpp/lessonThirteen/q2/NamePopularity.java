package com.miu.fpp.lessonThirteen.q2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NamePopularity {
    private static ArrayList<NameLog> girlNames = new ArrayList<>();
    private static ArrayList<NameLog> boyNames = new ArrayList<>();

    public static void main(String[] args) {
        PopulateList();
        System.out.println("This program is checking the directory of Social Security Administration for the year 2003");


        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();


        boolean hasGirlsName = false;
        boolean hasBoysName = false;

        for (int i = 0; i < girlNames.size(); i++) {
            if (girlNames.get(i).getName().equalsIgnoreCase(name)) {
                hasGirlsName = true;
                System.out.println(girlNames.get(i).getName() + " is ranked " + i + 1 + " in popularity among Girls with " + girlNames.get(i).getCount() + " namings.");
            }
        }
        if(!hasGirlsName){
            System.out.println(name+" is not ranked among the top 1000 girl names.");
        }

        for (int i = 0; i < boyNames.size(); i++) {
            if (boyNames.get(i).getName().equalsIgnoreCase(name)) {
                hasBoysName = true;
                System.out.println(boyNames.get(i).getName() + " is ranked " + i + 1 + " in popularity among Boys with " + boyNames.get(i).getCount() + " namings.");
            }
        }
        if(!hasBoysName){
            System.out.println(name+" is not ranked among the top 1000 boy names.");
        }


    }

    private static void PopulateList() {
        try {
            FileInputStream boyFiles = new FileInputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/boys.txt");
            DataInputStream bin = new DataInputStream(boyFiles);
            BufferedReader boysReader = new BufferedReader(new InputStreamReader(bin));

            FileInputStream girlsFiles = new FileInputStream("/Users/bazz/Documents/projectd/MAHARISHI/FPP/fpp/src/com/miu/fpp/lessonThirteen/q2/girls.txt");
            DataInputStream gin = new DataInputStream(girlsFiles);
            BufferedReader girlsReader = new BufferedReader(new InputStreamReader(gin));


            String val;
            ArrayList<String> boysStr = new ArrayList<>();
            while ((val = boysReader.readLine()) != null) {
                System.out.println(val);
                if (!val.isEmpty()) {
                    boysStr.add(val);
                }
            }
            val = "";
            ArrayList<String> girlsStrArr = new ArrayList<>();
            while ((val = girlsReader.readLine()) != null) {
                System.out.println(val);
                if (!val.isEmpty()) {
                    girlsStrArr.add(val);
                }
            }

            for (String boy : boysStr) {

                boyNames.add(new NameLog(boy.split(" ")[0], Integer.parseInt(boy.split(" ")[1])));
            }

            for (String girl : girlsStrArr) {
                girlNames.add(new NameLog(girl.split(" ")[0], Integer.parseInt(girl.split(" ")[1])));
            }

            boyFiles.close();
            girlsFiles.close();

            boysReader.close();
            girlsReader.close();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


class NameLog {
    private String name;
    private int count;

    public NameLog(String name, int count) {
        this.name = name;
        this.count = count;
    }


    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
