package ru.step3.task14;

public class Programmer implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Кодю... кодю... кодю...");
    }

    @Override
    public void drive() {
        System.out.println("Учился водить в GTA-2");
    }
}
