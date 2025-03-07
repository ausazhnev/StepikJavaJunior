package ru.step2.task6;

public class Conditions {
    public static void main(String[] args) {
        boolean isNight = false;
        boolean isGoodWeather = false;

        if (!isNight && isGoodWeather) {
            System.out.println("Идем гулять");
        }
        if (!isNight && !isGoodWeather) {
            System.out.println("Читаем книгу");
        }
        if (isNight) {
            System.out.println("Пора спать");
        }
    }
}
