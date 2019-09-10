package behavioral.command.Bank;


public class MiniPilot {
    Command slot;

    public MiniPilot() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void ButtonHasBeenPressed() {
        slot.execute();
    }
}
