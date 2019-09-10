package creational.factory;

public class Test {
    public static void main(String[] args) {
        Warrior czarodziej = new Warrior("Zenek", 14, Profession.WIZARD);
        Wand rozdzka = new Wand(18);
        rozdzka.hit();

        czarodziej.changeProfession(Profession.ARCHER);
        System.out.println(rozdzka.getDamage());

    }
}

