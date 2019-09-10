package behavioral.command.SuperPilot;

public class CommandStereoHiFiTurnOffCD implements ICommand {
    StereoHiFi stereoHiFi;

    public CommandStereoHiFiTurnOffCD(StereoHiFi stereoHiFi) {
        this.stereoHiFi = stereoHiFi;
    }

    @Override
    public void execute() {
        stereoHiFi.setVolume(0);
        stereoHiFi.turnOff();
    }

    @Override
    public void undo() {
        stereoHiFi.turnOn();
    }
}

