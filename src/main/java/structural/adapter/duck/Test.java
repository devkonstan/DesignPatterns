package structural.adapter.duck;

public class Test {
    public static void main(String[] args) {
        Kaczka dzika = new DzikaKaczka();
        dzika.latanieInterfejs.lec();
        dzika.wykonajLec();
        dzika.kwakanieInterfejs.kwacz();
        dzika.wykonajKwacz();
        dzika.wyswietl();
    }
}
