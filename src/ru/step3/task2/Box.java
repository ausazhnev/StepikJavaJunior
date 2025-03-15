package ru.step3.task2;

public class Box {
    double length;
    double width;
    double height;

    Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box() {
        this(10, 10, 10);
    }

    Box (Box newBox) {
        this(newBox.length, newBox.width, newBox.height);
    }

    double getVolume() {
        double volume = length * width * height;
        return volume;
    }

    int compare(Box newbox) {
        if (this.getVolume() > newbox.getVolume()) {
            return 1;
        } else if (this.getVolume() < newbox.getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }
}
