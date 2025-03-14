package ru.step3.task2;

public class Warehouse {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box();

        box1.height = 10;
        box1.width = 10;
        box1.length = 10;

        box2.height = 5;
        box2.width = 5;
        box2.length = 5;

        System.out.println("Объем первой коробки: " + box1.getVolume() + " куб.см.");
        System.out.println("Объем первой коробки: " + box2.getVolume() + " куб.см.");
    }
}
