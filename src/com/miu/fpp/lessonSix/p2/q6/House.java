package com.miu.fpp.lessonSix.p2.q6;

public class House extends Address {
    private double lotSize;


    public double getLotSize() {
        return lotSize;
    }

    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }

    public double getRent(){
        return 0.1 * lotSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "lotSize=" + lotSize +
                "\tCity=" + super.getCity() +
                "\tAddress=" + super.getAddress() +
                "\tZipCode=" + super.getZipCode() +
                '}';
    }
}
