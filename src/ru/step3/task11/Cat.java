package ru.step3.task11;

public class Cat extends CatFamily {
    public Cat() {
        super(4, 2, false);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" вискас.");
    }
}
