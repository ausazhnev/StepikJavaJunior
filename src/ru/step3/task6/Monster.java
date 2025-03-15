package ru.step3.task6;

public class Monster {
    int eyes;
    int hands;
    int legs;

    public Monster(int eyes, int hands, int legs) {
        this.eyes = eyes;
        this.hands = hands;
        this.legs = legs;
    }

    public Monster(int param) {
        this(param, param, param);
    }

    public Monster() {
        this(2);
    }

    void voice(int count, String word) {
        for (int i = 0; i < count; i++) {
            System.out.println(word);
        }
    }

    void voice(int count) {
        this.voice(count, "Grrrrrr...");
    }

    void voice() {
        this.voice(1);
    }
}
