package ru.step3.task12;

public class ShapeTestDrive {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10,1, 8);
        System.out.println(triangle.perimeter());

        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println(rectangle.perimeter());

    }
}
