package com.miu.fpp.finalprep.edet;


import java.util.HashMap;

public class Check {

    public static void main(String[] args) {

        Pair pair = new Pair("BAZZ", "BAZZ");
        Pair pair3 = new Pair("BAZZ", "BAZZ");

        System.out.println("pair".hashCode());
        System.out.println("pair".hashCode());
    }


}

class Pair {
    private String firstName;
    private String lastName;

    public Pair(String fname, String lname){
        this.firstName = fname;
        this.lastName = lname;
    }
}



