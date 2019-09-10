package behavioral.decorator.StarCafe;

public class Chocolate extends DecoratorComponent {
    Drink drink;

    public Chocolate(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Czekolada";
    }

    @Override
    public double expense() {
        return drink.expense() + 0.2;
    }
}
