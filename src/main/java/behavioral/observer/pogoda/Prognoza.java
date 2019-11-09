package behavioral.observer.pogoda;

import java.util.Observable;
import java.util.Observer;

public class Prognoza implements Observer, WyswietlElement {
    Observable observable;
    private float aktualnaTemperatura = 20f;
    private float aktualnaWilgotnosc = 45f;
    private float aktualneCisnienie = 110f;
    private float ostatniaTemperatura;
    private float ostatniaWilgotnosc;
    private float ostatnieCisninie;

    public Prognoza(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe) o; // rzutowanie Observable na DanePogodowe
            ostatniaTemperatura = aktualnaTemperatura;
            aktualnaTemperatura = danePogodowe.pobierzTemperature();
            ostatniaWilgotnosc = aktualnaWilgotnosc;
            aktualnaWilgotnosc = danePogodowe.pobierzWilgotnosc();
            ostatnieCisninie = aktualneCisnienie;
            aktualneCisnienie = danePogodowe.pobierzCisnienie();
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println("Ostatanie pomiary: \n" + "wilgotnosc " + ostatniaWilgotnosc + "->" + aktualnaWilgotnosc);
    }
}

