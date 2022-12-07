package com.miu.fpp.lessonSeven.q2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4);
        Rectangle rectangle = new Rectangle(4, 3);
        ShowArea(circle);
        ShowArea(rectangle);
    }

    private static void ShowArea(Shape shape) {
        double area = shape.area();
        System.out.println("The area of the shape is: "+area);

    }

}
