package ru.step3.task13;

public class Bird extends Animal implements AbleToFly, AbleToRun {

    @Override
    public void eat () {
        System.out.println("Клюет зерно.");
    }

    @Override
    public void fly () {
        System.out.println("Птица летит...");
    }

    @Override
    public void run() {
        System.out.println("Птица перебирает ножками...");
    }
}
