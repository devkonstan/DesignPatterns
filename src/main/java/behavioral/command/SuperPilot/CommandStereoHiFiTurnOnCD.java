package behavioral.command.SuperPilot;

public class CommandStereoHiFiTurnOnCD implements ICommand {
    StereoHiFi stereoHiFi;

    public CommandStereoHiFiTurnOnCD(StereoHiFi stereoHiFi) {
        this.stereoHiFi = stereoHiFi;
    }

    @Override
    public void execute() {
        stereoHiFi.turnOn();
        stereoHiFi.setCD();
        stereoHiFi.setVolume(11);
    }

    @Override
    public void undo() {
        stereoHiFi.turnOff();
    }
}
