package ru.step3.task13;

import java.util.ArrayList;

public class AnimalTestDrive {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Leon lion = new Leon();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Bird bird = new Bird();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(lion);
        animals.add(dog);
        animals.add(fish);

        for (Animal animal : animals) {
            animal.eat();
        }

        ArrayList<AbleToRun> runsAnimal = new ArrayList<>();
        runsAnimal.add(cat);
        runsAnimal.add(dog);
        runsAnimal.add(bird);

        for (AbleToRun animal : runsAnimal) {
            animal.run();
        }

        bird.fly();

    }


}
