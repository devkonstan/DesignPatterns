package behavioral.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        InputProvider subject = new InputProvider();
        MyTimer object = new MyTimer();
        subject.subscribe(object); //dodaje obiekt do listy obserwatorow
        object.start();
        object.update();
    }
}