package behavioral.command.SuperPilot;

public class CommandTurnOffLight implements ICommand {
    Light light;

    public CommandTurnOffLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }
}

