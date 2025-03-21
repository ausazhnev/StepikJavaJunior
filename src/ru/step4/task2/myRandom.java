package ru.step4.task2;

import java.util.Random;

public class myRandom {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt();
        System.out.println(a);

        int b = random.nextInt(10);
        System.out.println(b);

        // Случайное число от 5 до 10
        int c = random.nextInt(6);
        System.out.println(c + 5);
        System.out.println(random.nextInt(5,11));
    }
}
