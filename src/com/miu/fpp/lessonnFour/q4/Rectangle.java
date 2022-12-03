package com.miu.fpp.lessonnFour.q4;

public final class Rectangle {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double computeArea() {
        return width * height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String toString() {
        return "Area of Rectangle is: "+computeArea();
    }
}
