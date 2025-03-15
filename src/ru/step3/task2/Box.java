package ru.step3.task2;

public class Box {
    double length;
    double width;
    double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box() {
        this(10, 10, 10);
    }

    Box(Box newBox) {
        this(newBox.length, newBox.width, newBox.height);
    }

    double getVolume() {
        double volume = length * width * height;
        return volume;
    }

    int compare(Box newbox) {
        if (this.getVolume() > newbox.getVolume()) {
            return 1;
        } else if (this.getVolume() < newbox.getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }

    Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    Box increm() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    void getInfo() {
        System.out.println("Я коробка!");
        System.out.println("Моя ширина: " + this.width);
        System.out.println("Моя длинна: " + this.height);
        System.out.println("Моя высота: " + this.length);
        System.out.println("Мой объем: " + this.getVolume() + " куб.см.");
    }
}
