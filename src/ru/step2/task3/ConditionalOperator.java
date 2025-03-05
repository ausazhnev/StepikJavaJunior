package ru.step2.task3;

public class ConditionalOperator {
    public static void main(String[] args) {
        int temperature = 23;

        if (temperature > 25) {
            System.out.println("Пора включить кондиционер.");
        } else if (temperature < 22) {
            System.out.println("Пора выключить кондиционер.");
        } else {
            System.out.println("Отличная температура");
        }
    }
}
