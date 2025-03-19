package ru.step3.task12;

public class Shape {
    private int sideA;
    private int sideB;

    public Shape(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Shape() {
        this(10, 10);
    }

    public Shape(int side) {
        this(side, side);
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int perimeter () {
        return (this.sideA + this.sideB) * 2;
    }
}
