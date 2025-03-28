package ru.step2.task11;

public class ForEach {
    public static void main(String[] args) {
        String[] months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";

        for (String month : months) {
            System.out.println(month);
        }

        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 100;
        }

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
