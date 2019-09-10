package structural.composite.Example;

import java.util.ArrayList;

//kompozyt
public class CompositeSubassembly extends Subassembly {
    private ArrayList<Subassembly> subassemblies = new ArrayList<Subassembly>();

    public CompositeSubassembly(String name) {
        super(name);
    }

    @Override
    protected String getProductName() {
        return name;
    }

    @Override
    public void showMe() {
        super.showMe(); //pokazuje podzespoly
        for (Subassembly subassembly : subassemblies) {
            subassembly.showMe(); //pokazuje ich konkretne skladowe
        }
    }

    @Override
    public void addChild(Subassembly p) {
        subassemblies.add(p);
    }

    @Override
    public void removeChild(Subassembly p) {
        subassemblies.remove(p);
    }
}