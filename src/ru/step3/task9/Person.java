package ru.step3.task9;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя:\t\t" + this.name);
        System.out.println("Возраст:\t" + this.age);
    }
}
