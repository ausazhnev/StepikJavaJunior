package ru.step3.task12;

public class Rectangle extends Shape{
    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    public Rectangle() {
    }

    public Rectangle(int side) {
        super(side);
    }

    @Override
    public int perimeter() {
        return super.perimeter();
    }
}
