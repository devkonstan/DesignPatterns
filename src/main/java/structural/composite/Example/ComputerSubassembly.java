package structural.composite.Example;

public class ComputerSubassembly extends Subassembly {

    public ComputerSubassembly(String name) {
        super(name);
    }

    @Override
    protected String getProductName() {
        return name;
    }

    @Override
    public void addChild(Subassembly p) {
        throw new UnsupportedOperationException("not supported by ComputerSubassembly!");
    }

    @Override
    public void removeChild(Subassembly p) {
        throw new UnsupportedOperationException("not supported by ComputerSubassembly!");
    }
}