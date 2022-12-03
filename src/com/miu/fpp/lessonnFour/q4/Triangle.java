package com.miu.fpp.lessonnFour.q4;

public final class Triangle {


    private final double base;
    private final double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double computeArea() {
        double v = (base * height) / 2;
        return v;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }


    public String toString() {
        return "Area of Triangle is: " + computeArea();
    }
}
