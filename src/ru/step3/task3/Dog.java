package ru.step3.task3;

public class Dog {
    String name;
    String breed;
    int weight;

    String getInfo(){
        return "Я собака!\n" +
                "Мое имя: " + name + "\n" +
                "Порода: " + breed + "\n" +
                "Возраст: " + weight + " лет.";
    }
}
