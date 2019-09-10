package behavioral.observer;

public interface InterfaceInputProvider { //interfejs obserwowanego

    void subscribe(InterfaceMyTimer observer); //interfejs! a nie konkretna implementacja
    void unsubscribe(InterfaceMyTimer observer);
    void notifyAllObservers();

}
