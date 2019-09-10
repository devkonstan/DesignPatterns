package structural.adapter.animal;

public class Duck implements IAnimal {

    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}
