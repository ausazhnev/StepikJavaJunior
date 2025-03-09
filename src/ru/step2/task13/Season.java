package ru.step2.task13;

public class Season {
    public static void main(String[] args) {
        String month = "Январь";

        switch (month) {
            case "Январь":
            case "Февраль":
            case "Декабрь":
                System.out.println("Зима");
                break;
            case "Март":
            case "Апрель":
            case "Май":
                System.out.println("Весна");
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                System.out.println("Лето");
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                System.out.println("Осень");
                break;
            default:
                System.out.println("Что-то пошло не так.");
        }
    }
}
