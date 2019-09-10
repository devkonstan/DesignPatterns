package creational.singleton;

public class SingletonLogger {

    private static SingletonLogger sl;

    private SingletonLogger() {
    }
    //przypomina dostep do obiektu poprzez zmienne globalne
    public static SingletonLogger getSL() { //metoda klasowa -> tylko obiekt tej klasy moze utworzyc instancje
        if(sl == null) {
            sl = new SingletonLogger(); //dzieki utworzeniu z opoznieniem mozemy oszczedzic zasoby systemowe
        }
        return sl;
    }

    public void log(String text) {
        System.out.println(text);
    }

}

