package ru.step3.task12;

public class Triangle extends Shape {
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB);
        this.sideC = sideC;
    }

    public Triangle() {
        this.sideC = 10;
    }

    public Triangle(int side) {
        super(side);
        this.sideC = 10;
    }

    public Triangle(int sideA, int sideB) {
        super(sideA, sideB);
        this.sideC = 10;
    }

    @Override
    public int perimeter() {
        return getSideA() + getSideB() + this.sideC;
    }
}
