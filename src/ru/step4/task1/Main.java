package ru.step4.task1;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 1;
        try {
            int c = a / b;
            c = Integer.parseInt("test");

        } catch (ArithmeticException e) {
            System.out.println("На ноль делить нельзя!");
        } catch (NumberFormatException e) {
            System.out.println("Не смог преобразовать в число.");
        } catch (Exception e) {
            System.out.println("что-то пошло не так: " + e.getClass());
        }
        System.out.println("Все нормально работаем дальше.");

        int[] intArray = new int[3];
        for (int i = 0; i <5; i++) {
            try {
                intArray[i] = i;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(i + " Выходит за границы массива, там его размер: " + intArray.length);
            }

        }
    }
}
