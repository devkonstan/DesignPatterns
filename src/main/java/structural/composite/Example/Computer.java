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
        /*        Example.Subassembly system_unit = new Example.CompositeSubassembly("Jednostka Centralna");
                system_unit.addFile(new Example.ComputerSubassembly("Napęd DVD"));
        system_unit.addFile(new Example.ComputerSubassembly("Diody sygnalizacyjne"));
        Example.Subassembly processor = new Example.CompositeSubassembly("Procesor");
        Example.Subassembly registers = new Example.CompositeSubassembly("Rejestry");
        registers.addFile(new Example.ComputerSubassembly("Przerzutnik"));
        processor.addFile(registers);
        processor.addFile(new Example.ComputerSubassembly("ALU"));
        system_unit.addFile(new Example.ComputerSubassembly("Dysk twardy"));
        system_unit.addFile(new Example.ComputerSubassembly("Karta Graficzna"));
        system_unit.addFile(new Example.ComputerSubassembly("Pamięć"));
        system_unit.addFile(processor);
        main.addFile(keyboard);
        main.addFile(new Example.ComputerSubassembly("Monitor"));
        main.addFile(new Example.ComputerSubassembly("Mysz"));
        main.addFile(system_unit);*/
        main.showMe();
    }
}
