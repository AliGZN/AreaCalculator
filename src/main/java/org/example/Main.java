package org.example;

public class Main {
    public static void main(String[] args) {

        double radius = 5;
        double x = 5;
        double y = 4;

        double circleArea = Area.area(radius);
        System.out.println("Area of the circle with radius " + radius + " = " + circleArea);

        double rectangleArea = Area.area(x,y);
        System.out.println("Area of the rectangle with sides " + x + " and " + y + " = " + rectangleArea);

    }
}