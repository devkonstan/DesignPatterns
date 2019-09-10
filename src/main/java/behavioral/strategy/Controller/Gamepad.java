package behavioral.strategy.Controller;

public class Gamepad implements IController {

    public Gamepad() {

    }

    @Override
    public ControllerData readControllerData() {
        System.out.println("Driving with gamepad");
        return new ControllerData(50, 50); //na srodek
    }
}
