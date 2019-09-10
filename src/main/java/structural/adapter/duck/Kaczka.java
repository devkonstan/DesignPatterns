package structural.adapter.duck;

//to jest superklasa nadrzedna
public abstract class Kaczka {
    //zastosowana regula kompozycji zamiast dziedziczenia
    //obiekty skladowe implementuja poszczegolne zachowania
    KwakanieInterfejs kwakanieInterfejs; //zmienne typu interfejsowego definiujace zachowania
    LatanieInterfejs latanieInterfejs;  //czynnosci wykonywane przez kaczke de facto sa obiektem
    //zachowania kaczek sa rodzina algorytmow a nie zbiorem zachowan
    public Kaczka() { //konstruktor pusty

    }

    public abstract void wyswietl(); //metoda abstrakcyjna zmienna dla roznych rodzajow kaczek

    public void wykonajKwacz() { //delegujemy te zachowania do odpowiednich klas
        kwakanieInterfejs.kwacz();
    }

    public void wykonajLec() { //delegujemy te zachowania do odpowiednich klas
        latanieInterfejs.lec();
    }

    public void plywaj() {
        System.out.println("wszystkie kaczki plywaja!");
    }

    public void ustawLatanieInterfejs(LatanieInterfejs li) { //metoda umozliwiajaca zmiane zachowania
        latanieInterfejs = li;
    }

    public void ustawKwakanieInterfejs(KwakanieInterfejs ki) {
        kwakanieInterfejs = ki;
    }
}
