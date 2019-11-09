package sandbox.counter;

import java.util.Scanner;

public class CounterAnotherDemo {
    public static void main(String[] args) {
        Thread counterThread;

        counterThread = new Thread(() -> {
            int counter = 0;
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(++counter);
            }
        });
        counterThread.start();
        System.out.println(new Scanner(System.in).nextLine());
    }
}

