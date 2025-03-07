package ru.step2.task5;

public class FamilyAge {
    public static void main(String[] args) {
        int fatherAge = 75;
        int momAge = 67;
        int myAge = 40;
        int brotherAge = 52;
        float allAge = fatherAge + momAge + myAge + brotherAge;
        float rageAge = allAge / 4;
        System.out.println(rageAge);
    }
}
