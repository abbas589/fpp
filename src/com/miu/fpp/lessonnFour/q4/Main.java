package com.miu.fpp.lessonnFour.q4;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(4, 2);
        Rectangle rectangle = new Rectangle(40, 23);
        Circle circle = new Circle(15);


        System.out.println(triangle.toString());
        System.out.println(rectangle.toString());
        System.out.println(circle.toString());
    }
}
