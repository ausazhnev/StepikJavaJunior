package ru.step3.task13;

public class Cat extends Animal implements AbleToRun{
    @Override
    public void eat() {
        System.out.println("Кошачий корм.");
    }

    @Override
    public void run () {
        System.out.println("Кот крадется...");
    }
}
