package creational.factory;

public abstract class Weapon {
    protected int damage;

    public Weapon(int damage) {

        this.damage = damage;
    }

    public abstract void hit(); // tworzony tylko zeby klasy dziedziczace mialy schemat

    public int getDamage() {
        return damage;
    }
}
