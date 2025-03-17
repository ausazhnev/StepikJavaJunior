package ru.step3.task10;

import java.util.ArrayList;

public class WorkArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Дарт Вейдер");
        names.add("Капитан Тит");
        names.add("Капхед");
        names.add("Спартак");
        names.add("Люцифер");

        ArrayList<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 6; i++) {
            intList.add(i);
        }

        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            res.add(intList.get(i) + " - " + names.get(i));
        }

        for (String elem : res) {
            System.out.println(elem);
        }
    }
}
