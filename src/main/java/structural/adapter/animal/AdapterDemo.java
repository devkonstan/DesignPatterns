package structural.adapter.animal;

public class AdapterDemo {
    public static void main(String[] args) {
        AnimalPlanet animalPlanet = new AnimalPlanet();
        animalPlanet.makeSound(new Duck());

        MechanicalAnimalAdapter adapter = new MechanicalAnimalAdapter(new MechanicalDuck());
        animalPlanet.makeSound(adapter);
    }
}
