package structural.composite.Example;

public abstract class Subassembly {

    protected String name;

    public Subassembly(String name) {
        this.name = name;
    }

    protected abstract String getProductName();

    public void showMe() {
        System.out.println("Produkt " + this.getProductName());
    }

    public abstract void addChild(Subassembly p);

    public abstract void removeChild(Subassembly p);
}