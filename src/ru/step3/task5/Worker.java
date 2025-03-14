package ru.step3.task5;

public class Worker {
    String name;
    String post;
    int tax;
    boolean status;

    Worker(String name, String post, int tax, boolean status) {
        this.name = name;
        this.post = post;
        this.tax = tax;
        this.status = status;
    }

    void getInfo() {
        String textStatus;
        if (status) {
            textStatus = "Свободен";
        } else {
            textStatus = "Занят";
        }
        System.out.println("Привет, я " + name + "\n" +
                "Моя должность: " + post + "\n" +
                "Я зарабатываю: " + tax + "\n" +
                "Сейчас я: " + textStatus);
    }
}
