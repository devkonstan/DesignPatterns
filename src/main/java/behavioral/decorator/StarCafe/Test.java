package behavioral.decorator.StarCafe;

public class Test {
    public static void main(String[] args) {
        Drink drink = new Chocolate(new Espresso());
        System.out.println(drink.getDescription());
        System.out.println(drink.expense());
    }
}
