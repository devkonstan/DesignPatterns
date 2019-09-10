package creational.factory;

public class Warrior {
    private final String nickname;
    private int lvl;
    private Profession profession;
    private Weapon weapon;
    private final WeaponFactory weaponFactory;

    public Warrior(String nickname, int lvl, Profession profession) {
        this.nickname = nickname;
        this.lvl = lvl;
        this.profession = profession;
        weaponFactory = new WeaponFactory();
        changeProfession(profession);

    }

    public void changeProfession(Profession newProfession) {
        //if(newProfession!=profession) {
        profession = newProfession;
        weaponFactory.switchWeapon(newProfession, 30);
        //}
    }
}

