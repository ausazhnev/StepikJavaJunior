package ru.step3.task3;

public class Main {
    public static void main(String[] args) {
        Dog tuzik = new Dog();
        tuzik.name = "Тузик";
        tuzik.breed = "МехоДог";
        tuzik.weight = 11;

        System.out.println(tuzik.getInfo());
    }
}
