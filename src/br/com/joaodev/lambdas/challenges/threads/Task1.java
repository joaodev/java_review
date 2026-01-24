package br.com.joaodev.lambdas.challenges.threads;

public class Task1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println("Task 1 #" + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}
