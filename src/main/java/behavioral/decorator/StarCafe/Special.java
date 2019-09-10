package behavioral.decorator.StarCafe;

public class Special extends Drink {

    public Special() {
        description ="Kawa Special";
    }

    @Override
    public double expense() {
        return 0.89;
    }
}
