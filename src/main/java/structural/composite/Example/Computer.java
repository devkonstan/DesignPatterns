package structural.composite.Example;

public class Computer {
    public static void main(String[] args) {
        Subassembly main = new CompositeSubassembly("Komputer"); //root
        Subassembly keyboard = new CompositeSubassembly("Klawiatura");
        Subassembly alfaKeyboard = new CompositeSubassembly("Klawiatura alfanumeryczna");
        alfaKeyboard.addChild(new ComputerSubassembly("Klawisze funkcyjne F1-F12"));
        keyboard.addChild(alfaKeyboard);
        keyboard.addChild(new ComputerSubassembly("Klawiatura numeryczna"));
        main.addChild(keyboard);
        Subassembly system_unit = new CompositeSubassembly("Jednostka Centralna");
        system_unit.addChild(new ComputerSubassembly("Napęd DVD"));
        system_unit.addChild(new ComputerSubassembly("Diody sygnalizacyjne"));
        Subassembly processor = new CompositeSubassembly("Procesor");
        system_unit.addChild(processor);
        Subassembly registers = new CompositeSubassembly("Rejestry");
        registers.addChild(new ComputerSubassembly("Przerzutnik"));
        processor.addChild(registers);
        processor.addChild(new ComputerSubassembly("ALU"));
        system_unit.addChild(new ComputerSubassembly("Dysk twardy"));
        system_unit.addChild(new ComputerSubassembly("Karta Graficzna"));
        system_unit.addChild(new ComputerSubassembly("Pamięć"));
        main.addChild(new ComputerSubassembly("Monitor"));
        main.addChild(new ComputerSubassembly("Mysz"));
        main.addChild(system_unit);
        main.showMe();
    }
}
