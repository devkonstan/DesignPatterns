package behavioral.decorator.StarCafe;

public abstract class Drink {
    String description = "Napoj domyslny";

    public String getDescription() {
        return description;
    }

    public abstract double expense();
}