package ru.step3.task2;

public class Warehouse {
    public static void main(String[] args) {
        Box box1 = new Box();

        box1.height = 10;
        box1.width = 10;
        box1.length = 10;

        box1.getInfo();

        Box box2 = box1.copy();
        box2.getInfo();

        Box box3 = box2.increm();

        box3.getInfo();


//        box2.height = 5;
//        box2.width = 5;
//        box2.length = 5;
//
//        Box box3 = new Box(box2);
//
//        Box box4 = box2.copy();
//
//        System.out.println("Объем первой коробки: " + box1.getVolume() + " куб.см.");
//        System.out.println("Объем первой коробки: " + box2.getVolume() + " куб.см.");
//        System.out.println("Объем первой коробки: " + box3.getVolume() + " куб.см.");
//
//        System.out.println(box1.compare(box2));
//        System.out.println(box3.compare(box2));
    }
}
