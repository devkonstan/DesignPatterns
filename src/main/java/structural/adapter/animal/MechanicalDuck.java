package structural.adapter.animal;

public class MechanicalDuck implements IMechanicalAnimal {

    @Override
    public void doMechanicalSound() {
        System.out.println("doMechanicalSound");
    }
}
