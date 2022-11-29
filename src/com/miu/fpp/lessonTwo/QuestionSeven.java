package com.miu.fpp.lessonTwo;

import java.util.Random;

public class QuestionSeven {
    public static void main(String[] args) {
        double[] yearTemp = new double[365];


        for (int i = 0; i < yearTemp.length; i++) {
            yearTemp[i] = -15 + new Random().nextInt(55);
        }

        double coldest = 0.0;
        double hottest = 0.0;
        int coldestDay = 0;
        int hottestDay = 0;




        for (int i = 0; i < yearTemp.length; i++) {
            if(coldest > yearTemp[i]){
                coldest = yearTemp[i];
                coldestDay = i+1;
            }

            if(hottest < yearTemp[i]){
                hottest = yearTemp[i];
                hottestDay = i+1;
            }

        }

        System.out.println("Coldest Temp is : "+ coldest + " Degree Celsius On the "+coldestDay+" Day of the Year");
        System.out.println("Hotest Temp is : "+ hottest + " Degree Celsius On the "+hottestDay+" Day of the Year");

    }

}
