package ru.step3.task13;

public class Dog extends Animal implements AbleToRun{

    @Override
    public void eat() {
        System.out.println("Хрумкает Чаппи.");
    }

    @Override
    public void run () {
        System.out.println("Собака бежит...");
    }
}
