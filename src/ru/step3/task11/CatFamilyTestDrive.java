package ru.step3.task11;

public class CatFamilyTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();

        System.out.println(cat.isCanEatPerson);
        System.out.println(lion.isCanEatPerson);

        cat.eat();
        lion.eat();
    }
}
