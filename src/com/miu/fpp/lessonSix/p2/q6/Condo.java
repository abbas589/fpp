package com.miu.fpp.lessonSix.p2.q6;

public class Condo extends Address{
    private int numberOfFloors;


    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public double getRent(){
        return 400 * numberOfFloors;
    }

    @Override
    public String toString() {
        return "Condo{" +
                "numberOfFloors=" + numberOfFloors +
                "\tCity=" + super.getCity() +
                "\tAddress=" + super.getAddress() +
                "\tZipCode=" + super.getZipCode() +
                '}';
    }
}
