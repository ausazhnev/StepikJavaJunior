package ru.step3.task15;

public class ClientTestDrive {
    public static void main(String[] args) {
        Client client = new Client();

        client.makeOrder(new Waiter() {
            @Override
            public void bringOrder(String food) {
                System.out.println("Подаю " + food);
            }
        }, "пельмени");
    }
}
