package ru.step3.task14;

public class Director implements Worker {
    @Override
    public void work() {
        System.out.println("Работаю директором, раздаю указания.");
    }
}
