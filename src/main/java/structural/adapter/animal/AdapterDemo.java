package structural.adapter.animal;

public class AdapterDemo {
    public static void main(String[] args) {
        AnimalAdapter animalAdapter = new AnimalAdapter();
        animalAdapter.makeSound(new Duck());

        MechanicalAnimalAdapter adapter = new MechanicalAnimalAdapter(new MechanicalDuck());
        animalAdapter.makeSound(adapter);
    }
}
