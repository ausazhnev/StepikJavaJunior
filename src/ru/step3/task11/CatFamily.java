package ru.step3.task11;

public class CatFamily {
    protected int legs;
    protected int eyes;
    protected boolean isCanEatPerson;

    public CatFamily(int legs, int eyes, boolean isCanEatPerson) {
        this.legs = legs;
        this.eyes = eyes;
        this.isCanEatPerson = isCanEatPerson;
    }

//    public CatFamily() {
//        this.legs = 4;
//        this.eyes = 3;
//        this.isCanEatPerson = true;
//    }


    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setCanEatPerson(boolean canEatPerson) {
        isCanEatPerson = canEatPerson;
    }


    public int getLegs() {
        return legs;
    }


    public int getEyes() {
        return eyes;
    }

    public boolean isCanEatPerson() {
        return isCanEatPerson;
    }


    public void eat() {
        System.out.print("Ест");
    }
}



