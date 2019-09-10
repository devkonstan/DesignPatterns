package behavioral.command.SuperPilot;

public class CommandTurnOnLight implements ICommand {
    Light light;

    public CommandTurnOnLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }
}
