package ru.step3.task1;

public class People {
    public static void main(String[] args) {
        Human first = new Human();
        Human second = new Human();
        Human third = new Human();

        first.name = "R2D2";
        first.age = 23;
        first.height = 150;

        second.name = "Саурон";
        second.age = 51;
        second.height = 197;

        third.name = "Патрик";
        third.age = 12;
        third.height = 102;

        float averageAge = (first.age + second.age + third.age) / 3.0f;
        averageAge = Math.round(averageAge * 100) / 100f;
        float averageHeight = (first.height + second.height + third.height) / 3.0f;
        averageHeight = Math.round(averageHeight * 100) / 100f;
        System.out.println("Средний возраст: " + averageAge + " лет.");
        System.out.println("Средний рост: " + averageHeight + " см.");
    }
}
