package structural.adapter.duck;

public class DzikaKaczka extends Kaczka {

    public DzikaKaczka() { //zmienne obiektowe odziedziczone po interfejsie Kaczka
        kwakanieInterfejs = new Kwacz(); //klasa Kwacz odpowiedzialna za przebieg kwakania
        latanieInterfejs = new LatamBoMamSkrzydla(); //klasa LatamBoMamSkrzydla jest definicja lotu
    }

    @Override
    public void wyswietl() { //nadpisana metoda abstrakcyjna w interfejsie Kaczka
        System.out.println("jestem prawdziwa kaczka!");
    }
}
