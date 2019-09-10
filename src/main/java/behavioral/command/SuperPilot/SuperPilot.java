package behavioral.command.SuperPilot;

public class SuperPilot {
    ICommand[] commandsTurnOn;
    ICommand[] commandsTurnOff;
    ICommand commandUndo;

    public SuperPilot() {
        commandsTurnOn = new ICommand[7];
        commandsTurnOff = new ICommand[7];

        ICommand brakPolecenia = new NoCommand();
        for (int i = 0; i < commandsTurnOn.length; i++) {
            commandsTurnOn[i] = brakPolecenia;
            commandsTurnOff[i] = brakPolecenia;
        }
        commandUndo = brakPolecenia;
    }

    public void setCommand(int slot, ICommand polecenieWlacz, ICommand polecenieWylacz) {
        commandsTurnOn[slot] = polecenieWlacz;
        commandsTurnOff[slot] = polecenieWylacz;
    }

    public void TurnOnButtonWasPressed(int slot) {
        commandsTurnOn[slot].execute();
        commandUndo = commandsTurnOn[slot]; //sluzy do sledzenia polecenia powyzszego
    }

    public void TurnOffButtonWasPressed(int slot) {
        commandsTurnOff[slot].execute();
        commandUndo = commandsTurnOff[slot];
    }

    public void UndoButtonWasPressed() {
        commandUndo.undo();
    }

    @Override
    public String toString() {
        StringBuffer sB = new StringBuffer();
        sB.append("\n---- SuperPilot ----\n");
        for (int i = 0; i < commandsTurnOn.length; i++) {
            sB.append("[slot " + i + "] " + commandsTurnOn[i].getClass().getName() + "   " + commandsTurnOff[i].getClass().getName() + "\n");

        }
        return sB.toString();

    }
}
