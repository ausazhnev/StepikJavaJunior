package ru.step3.task9;

public class PersonTestDrive {
    public static void main(String[] args) {
        String workSrt = "Hi, this is Panda. I'm 41 years old.";
        String name = workSrt.substring(12, 17);
        int age = Integer.parseInt(workSrt.substring(23,25));

        Person panda = new Person(name, age);

        panda.info();
    }
}
