package com.miu.fpp.lessonSix.p2.q6;

import java.util.ArrayList;

public class AdminModule {
    public static void main(String[] args) {

        ArrayList<Object> properties = new ArrayList<>();

        Condo condo = new Condo();
        condo.setNumberOfFloors(4);
        condo.setAddress("100N 4th");
        condo.setCity("Fairlfield");
        condo.setZipCode("52557");
        properties.add(condo);


        Condo condo2 = new Condo();
        condo2.setNumberOfFloors(4);
        condo2.setAddress("100N 4th");
        condo2.setCity("Otummwa");
        condo2.setZipCode("52557");
        properties.add(condo2);


        House house = new House();
        house.setAddress("101N 4th");
        house.setCity("Fairlfield");
        house.setLotSize(5);
        house.setZipCode("52557");
        properties.add(house);

        Trailer trailer = new Trailer();
        trailer.setAddress("102 4th");
        trailer.setCity("Fairfield");
        trailer.setZipCode("52334");
        properties.add(trailer);


        double totalRent = condo.getRent() + house.getRent() + trailer.rent + condo2.getRent();
        System.out.println("Total Rent is: " + totalRent);


        //FINDING PROPERTIES WITH CITY Fairfield
        String city = "Fairfield";

        System.out.println("Printing properties with city: " + city);
        for (Object prop : properties) {
            if (prop instanceof Condo) {
                Condo cd = (Condo) prop;
                if (cd.getCity().equals(city)) {
                    System.out.println(condo.toString());
                }
            }
            if (prop instanceof House) {
                House hs = (House) prop;
                if (hs.getCity().equals(city)) {
                    System.out.println(hs.toString());
                }
            }
            if (prop instanceof Trailer) {
                Trailer tr = (Trailer) prop;
                if (tr.getCity().equals(city)) {
                    System.out.println(tr.toString());
                }
            }
        }


    }


}
