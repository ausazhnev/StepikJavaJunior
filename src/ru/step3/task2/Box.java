package ru.step3.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box() {
        this(10, 10, 10);
    }

    public Box(Box newBox) {
        this(newBox.length, newBox.width, newBox.height);
    }

    public double getVolume() {
        double volume = length * width * height;
        return volume;
    }

    public int compare(Box newbox) {
        if (this.getVolume() > newbox.getVolume()) {
            return 1;
        } else if (this.getVolume() < newbox.getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }

    public Box copy() {
        return new Box(this.length, this.width, this.height);
    }

    public Box increm() {
        return new Box(this.length * 2, this.width * 2, this.height * 2);
    }

    public void getInfo() {
        System.out.println("Я коробка!");
        System.out.println("Моя ширина: " + this.width);
        System.out.println("Моя длинна: " + this.height);
        System.out.println("Моя высота: " + this.length);
        System.out.println("Мой объем: " + this.getVolume() + " куб.см.");
    }
}
