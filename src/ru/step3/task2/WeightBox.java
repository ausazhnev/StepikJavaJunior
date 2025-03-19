package ru.step3.task2;

public class WeightBox extends Box {
    private double weight;

    public WeightBox() {
        super();
        setWeight(1);
    }

    public WeightBox(double length, double width, double height, double weight) {
        super(length, width, height);
        setWeight(width);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Мой вес: " + this.weight + " кг.");
    }
}
