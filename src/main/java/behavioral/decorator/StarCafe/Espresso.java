package behavioral.decorator.StarCafe;

public class Espresso extends Drink {

    public Espresso() {
        description ="Kawa Espresso";
    }

    @Override
    public double expense() {
        return 1.99;
    }
}
