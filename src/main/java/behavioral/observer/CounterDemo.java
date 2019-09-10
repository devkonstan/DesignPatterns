package behavioral.observer;

import java.util.Scanner;

public class CounterDemo {
    public static void main(String[] args) {
        Thread counterThread;

        counterThread = new Thread(() -> {
            for (int i = 0; ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i + 1);
            }
        });
        counterThread.start();

        while (true) {
            System.out.println(new Scanner(System.in).nextLine());
        }
    }
}