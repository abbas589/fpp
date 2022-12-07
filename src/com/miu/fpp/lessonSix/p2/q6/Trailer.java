package com.miu.fpp.lessonSix.p2.q6;

public class Trailer extends Address {
    public final double rent = 500.0;

    @Override
    public String toString() {
        return "Trailer{" +
                "rent=" + rent +
                "\tCity=" + super.getCity() +
                "\tAddress=" + super.getAddress() +
                "\tZipCode=" + super.getZipCode() +
                '}';
    }
}
