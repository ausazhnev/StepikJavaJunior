package ru.step3.task6;

public class MonsterTestDrive {
    public static void main(String[] args) {
        Monster monster = new Monster();
        Monster monster1 = new Monster(4);
        monster.voice();
        monster.voice(3);
        monster1.voice(3, "Frrrrr....");
    }
}
