package ru.step2.task8;

public class EvenNumbers {
    public static void main(String[] args) {
        int stopMum = 1000;
        int workNum = 0;
        while (workNum <= stopMum) {
            if (workNum % 2 == 0) {
                System.out.println(workNum);
            }
            workNum++;
        }
    }
}
