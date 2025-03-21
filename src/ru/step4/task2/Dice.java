package ru.step4.task2;

import java.util.Random;

public class Dice {
    public static void main(String[] args) {
        int lowNum = 1;
        int topNum = 6;

        for (int i = 0; i <100; i++) {
            rollDice(lowNum, topNum);
        }
    }

    static void rollDice (int lowNum, int topNum) {
        Random random = new Random();
        System.out.println(String.format("""
                На кубике выпало: %d""", (random.nextInt(lowNum, topNum + 1))));
    }
}
