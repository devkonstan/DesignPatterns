package structural.adapter.duck;

public class ModelKaczki extends Kaczka {
    public ModelKaczki() {
        kwakanieInterfejs = new Kwacz();
        latanieInterfejs = new NieLatam(); // model nie umie latac na poczatku
    }

    @Override
    public void wyswietl() {
        System.out.println("jestem modelem kaczki!");
    }
}
