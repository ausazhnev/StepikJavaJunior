package ru.step3.task2;

public class Box {
    double length;
    double width;
    double height;

    double getVolume() {
        double volume = length * width * height;
        return volume;
    }

    int compare (Box newbox) {
        if (this.getVolume() > newbox.getVolume()) {
            return 1;
        } else if (this.getVolume() < newbox.getVolume()) {
            return -1;
        } else {
            return 0;
        }
    }
}
