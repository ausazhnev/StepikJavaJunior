package ru.step3.task3;

public class Dog {
    String name;
    String breed;
    int weight;
    int speed;

    String getInfo(){
        return "Я собака!\n" +
                "Мое имя: " + name + "\n" +
                "Порода: " + breed + "\n" +
                "Возраст: " + weight + " лет.";
    }

    void run (){
        for (int i=0; i<speed; i++){
            System.out.println("Бегу ");
        }
    }
}
