package behavioral.command.SuperPilot;

public class PilotTest {
    public static void main(String[] args) {
        SuperPilot superPilot = new SuperPilot();

        Light jadalnia = new Light();
        StereoHiFi wiezyczka = new StereoHiFi();

        CommandTurnOnLight jadalniawlacz = new CommandTurnOnLight(jadalnia);
        CommandTurnOffLight jadalniawylacz = new CommandTurnOffLight(jadalnia);

        CommandStereoHiFiTurnOnCD wiezyczkawlacz = new CommandStereoHiFiTurnOnCD(wiezyczka);
        CommandStereoHiFiTurnOffCD wiezyczkawylacz = new CommandStereoHiFiTurnOffCD(wiezyczka);

        superPilot.setCommand(0, jadalniawlacz, jadalniawylacz);
        superPilot.setCommand(1, wiezyczkawlacz, wiezyczkawylacz);

        System.out.println(superPilot);

        superPilot.TurnOnButtonWasPressed(0);
        superPilot.TurnOffButtonWasPressed(0);
        superPilot.UndoButtonWasPressed();
        superPilot.TurnOnButtonWasPressed(0);
        superPilot.UndoButtonWasPressed();
        System.out.println("*******");
        superPilot.TurnOnButtonWasPressed(1);
        superPilot.TurnOffButtonWasPressed(1);
        superPilot.UndoButtonWasPressed();
        superPilot.UndoButtonWasPressed();
    }
}
