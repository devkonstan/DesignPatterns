package creational.factory;

public class WeaponFactory {
    public Weapon switchWeapon(Profession profession, int damage) {
        switch (profession) {
            case ARCHER:
                return new Bow(damage);
            case SWORDSMAN:
                return new Sword(damage);
            case WIZARD:
                return new Wand(damage);
            default:
                throw new IllegalStateException("No weapon like that");
        }
    }
}

