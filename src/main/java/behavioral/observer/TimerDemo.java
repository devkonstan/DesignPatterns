package behavioral.observer;

import java.util.Random;
import java.util.Scanner;

public class TimerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("napisz coś:");
        while (true) {
            String znak = sc.nextLine();
            System.out.println(znak);
            if (znak.equals("exit")) {
                break;
            }
        }
    }
}
