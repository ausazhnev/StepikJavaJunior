package ru.step3.task4;

public class Rectangle {
    int length;
    int width;

    void setParam(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int getSquare() {
        return this.length * this.width;
    }
}
