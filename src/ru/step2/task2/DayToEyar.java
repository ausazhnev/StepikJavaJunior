package ru.step2.task2;

public class DayToEyar {
    public static void main(String[] args) {
        int baseDays = 1001;
        int tmp;
        int eyars = baseDays / 365;
        tmp = baseDays % 365;
        int months = tmp / 30;
        int days = tmp % 30;

        System.out.println(baseDays + " дней это:");
        System.out.println("Лет - " + eyars);
        System.out.println("Месяцев - " + months);
        System.out.println("Дней - " + days);
    }
}
