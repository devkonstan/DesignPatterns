package behavioral.observer;
//interfejs obserwowanego
public interface InterfaceInputProvider {

    void subscribe(InterfaceMyTimer observer);
    void unsubscribe(InterfaceMyTimer observer);
    void notifyAllObservers();

}
