package structural.adapter.animal;

public class MechanicalAnimalAdapter implements IAnimal {
    //zaleznosc klasy
    private final IMechanicalAnimal adaptedMechanicalAnimal;

    public MechanicalAnimalAdapter(IMechanicalAnimal adaptedMechanicalAnimal) {
        this.adaptedMechanicalAnimal = adaptedMechanicalAnimal;
    }

    @Override
    public void makeSound() {

        adaptedMechanicalAnimal.doMechanicalSound();
    }
}
