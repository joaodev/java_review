package br.com.joaodev.lambdas.challenges.threads;

public class Threads {

    public static void main(String[] args) {

        Runnable t1 = new Task1();
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 100; i++) {
                    System.out.println("Task 2 #" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                    }
                }
            }
        };

        Runnable t3 = Threads::task3;

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        Thread thread3 = new Thread(t3);

        thread1.start();
        thread2.start();
        thread3.start();
    }

    static void task3() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Task 3 #" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
