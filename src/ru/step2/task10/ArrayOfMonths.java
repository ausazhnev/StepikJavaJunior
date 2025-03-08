package ru.step2.task10;

public class ArrayOfMonths {
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

        for (int i = 0; i <=11; i++) {
            System.out.println(months[i]);
        }

        for (int i = 0; i < months.length; i++) {
            System.out.print(months[i]);
            if (i != months.length-1) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
        System.out.println();
        for (int i = months.length -1; i >= 0; i--) {
            System.out.print(months[i]);
            if (i != 0) {
                System.out.print(", ");
            } else {
                System.out.print(".");
            }
        }
    }
}
