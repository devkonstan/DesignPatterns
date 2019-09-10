package structural.adapter.animal;

public class MechanicalAnimalAdapter implements IAnimal {

    private final IMechanicalAnimal adaptedMechanicalAnimal; //zaleznosc klasy

    public MechanicalAnimalAdapter(IMechanicalAnimal adaptedMechanicalAnimal) {
        this.adaptedMechanicalAnimal = adaptedMechanicalAnimal;
    }

    @Override
    public void makeSound() {
        adaptedMechanicalAnimal.doMechanicalSound();
    }
}
