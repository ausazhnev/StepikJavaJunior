package ru.step3.task14;

import java.util.ArrayList;

public class WorkerTestDrive {
    public static void main(String[] args) {
        Director director = new Director();
        Programmer programmer = new Programmer();
        Cook cook = new Cook();

        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(director);
        workers.add(programmer);
        workers.add(cook);

        for (Worker job : workers) {
            job.work();
        }

        System.out.println();
        ArrayList<Driver> canDrive = new ArrayList<>();
        canDrive.add(programmer);
        canDrive.add(cook);

        for (Driver drive : canDrive) {
            drive.drive();
        }

    }
}
