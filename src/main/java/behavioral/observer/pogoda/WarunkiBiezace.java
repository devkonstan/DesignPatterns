package behavioral.observer.pogoda;

import java.util.Observable;
import java.util.Observer;

public class WarunkiBiezace implements Observer, WyswietlElement {
    Observable observable;
    private float temperatura;
    private float wilgotnosc;
    private float cisnienie;

    public WarunkiBiezace(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof DanePogodowe) {
            DanePogodowe danePogodowe = (DanePogodowe) o; // rzutowanie Observable na DanePogodowe
            this.temperatura = danePogodowe.pobierzTemperature();
            this.wilgotnosc = danePogodowe.pobierzWilgotnosc();
            this.cisnienie = danePogodowe.pobierzCisnienie();
            wyswietl();
        }
    }

    @Override
    public void wyswietl() {
        System.out.println("Warunki biezace: " + temperatura + "\u2103 " + wilgotnosc + "% wilgotnosci " + cisnienie + "hPa");
    }
}
