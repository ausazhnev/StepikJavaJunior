package ru.step3.task7;

public class MyMath {
    private static final float PI = 3.14f;


    public static int square(int num) {
        return num * num;
    }

    public static float square(float num) {
        return num * num;
    }

    public static double square(double num) {
        return num * num;
    }


    public static int cube(int num) {
        return num * num * num;
    }

    public static float cube(float num) {
        return num * num * num;
    }

    public static double cube(double num) {
        return num * num * num;
    }

    public static double circleLength (double radius) {
        return 2 * PI * radius;
    }

    public static double areaCircle (double radius) {
        return PI * radius * radius;
    }
}
