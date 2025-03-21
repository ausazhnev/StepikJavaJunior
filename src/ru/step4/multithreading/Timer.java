package ru.step4.multithreading;

public class Timer implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(i);
        }
    }
}
