package behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InputProvider implements InterfaceInputProvider { //jest obserwowany PODMIOT
    private List<InterfaceMyTimer> observers = new ArrayList<InterfaceMyTimer>(); //lista obserwatorow
    //skaner owiniety w klase -> jest ona niemodyfikowalna a InputProvider moge zmieniac
    private final Scanner scanner = new Scanner(System.in);

    public String getInput() {
        String input = scanner.nextLine();

        if (input.equals("q")) {
            notifyAllObservers();
        }
        return input;
    }

    @Override
    public void subscribe(InterfaceMyTimer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(InterfaceMyTimer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(InterfaceMyTimer::update);
        observers.forEach(InterfaceMyTimer::exitRequested);
    }
}