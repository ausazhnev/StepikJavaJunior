package ru.step4.guessnumbergame;

import java.util.HashSet;
import java.util.Random;

public class Game {
    static volatile boolean isWin = false;
    private static final int lowNum = 0;
    private static final int topNum = 101;


    static Random random = new Random();
    private static final int hiddenNumber = random.nextInt(lowNum, topNum);

    public static void main(String[] args) {
        System.out.printf("Я загадал число: %d%n", hiddenNumber);

        // Угадываем число
        Thread guessing = new Thread(new Runnable() {
            HashSet<Integer> numbers = new HashSet<>();
            @Override
            public void run() {
                int guess;
                while (true) {
                    do {
                        guess = random.nextInt(lowNum, topNum);
                    } while (numbers.contains(guess));
                    numbers.add(guess);

                    System.out.printf("Я думаю что это число - %d%n", guess);
                    if (guess == hiddenNumber) {
                        isWin = true;
                        break;
                    }
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        guessing.start();

        // Таймер игры
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; true; j++) {
                    if (isWin) {
                        System.out.printf("Победа!!! Потрачено: %d сек.%n", j);
                        break;
                    }
                    System.out.printf("Прошло - %d сек.%n", j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        timer.start();
    }
}
