package ru.step4.task2;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name = "John Doe";
        this.age = 0;
    }

    @Override
    public String toString() {

//        return "Меня зовут: " + name + " мне: " + age + " лет";
        return String.format("Меня зовут: %s мне: %d", this.name, this.age);
    }
}
