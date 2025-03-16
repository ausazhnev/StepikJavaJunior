package ru.step3.task8;

public class MyArrayListTestDrive {
    public static void main(String[] args) {
        MyArrayList testArray = new MyArrayList();

        testArray.add("Первый");
        testArray.add("Второй");
        testArray.showArray();
        testArray.remove(1);
        testArray.add("Второй");
        testArray.remove("Второй");
        testArray.showArray();

        System.out.println(testArray.getSize());

    }
}
