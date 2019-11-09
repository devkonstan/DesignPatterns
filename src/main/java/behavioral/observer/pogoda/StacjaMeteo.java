package behavioral.observer.pogoda;

public class StacjaMeteo {
    public static void main(String[] args) {
        DanePogodowe danePogodowe = new DanePogodowe();

        WarunkiBiezace warunkiBiezace = new WarunkiBiezace(danePogodowe);

        danePogodowe.ustawOdczyty(34.5f, 21.0f, 134.5f);
        danePogodowe.ustawOdczyty(23.5f, 53.0f, 120f);

        DanePogodowe dp = new DanePogodowe();
        Prognoza prognoza = new Prognoza(dp);
        dp.ustawOdczyty(50f,25f,115f);
    }
}
