package ru.step3.task11;

public class Lion extends CatFamily {
    public Lion() {
        super(4, 2, true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println(" антилопу.");
    }
}
