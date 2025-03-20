package ru.step3.task14;

public class Cook implements Worker, Driver {
    @Override
    public void work() {
        System.out.println("Готовлю что то вкусное.");
    }

    @Override
    public void drive() {
        System.out.println("Еду как могу...");
    }
}
