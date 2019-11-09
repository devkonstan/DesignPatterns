package behavioral.observer.pogoda;

import java.util.Observable;

// podmiot (obserwowany
public class DanePogodowe extends Observable {
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public DanePogodowe() {
    }

    public void odczytyZmiana() {
        setChanged();
        notifyObservers();
    }

    // najpierw odczytuje zmiany z czujnikow a potem wysyla info do obserwatorow
    public void ustawOdczyty(float temperatura, float wilgotnosc, float cisnienie) {
        this.temperatura = temperatura;
        this.wilgotnosc = wilgotnosc;
        this.cisnienie = cisnienie;
        odczytyZmiana();
    }

    // metody pobieraniowe
    public float pobierzTemperature() {
        return temperatura;
    }

    public float pobierzWilgotnosc() {
        return wilgotnosc;
    }

    public float pobierzCisnienie() {
        return cisnienie;
    }
}
