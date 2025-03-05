package ru.step2.task4;
import java.util.Random;

public class WhatToEat {
    public static void main(String[] args) {
        Random random = new Random();
        int myMoney = random.nextInt(20);
        System.out.println("У меня есть " + myMoney + "$");
        ChangeEat(myMoney);
    }

    public static void ChangeEat(int money) {
        if (money > 10) {
            System.out.println("Буду есть пиццу.");
        } else if (money > 6) {
            System.out.println("Буду есть бургер.");
        } else {
            System.out.println("Пока голодаем.");
        }
    }
}
