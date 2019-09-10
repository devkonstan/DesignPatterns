package structural.adapter.duck;

public class SymulatorKaczki {
    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.wykonajKwacz();
        dzika.wykonajLec();

        System.out.println("*******");

        Kaczka model = new ModelKaczki();
        model.wykonajLec();
        model.ustawLatanieInterfejs(new LotZNapedemRakietowym()); //dynamiczna zmiana zachowania
        model.wykonajLec();
    }
}
