package ru.step4.multithreading;

public class TimerTestDrive {
    public static void main(String[] args) {
// Вариант с созданием объекта
//        Timer timer = new Timer();
//        Thread thread = new Thread(timer);
//        thread.start();


        // Вариант с созданием анонимного класса
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 1_000; j++) {
                    System.out.println(j);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });
        thread.start();

        for (int i = 0; i < 1_000; i++) {
            System.out.println('2');
        }
    }
}
