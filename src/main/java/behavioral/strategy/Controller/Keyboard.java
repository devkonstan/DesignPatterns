package behavioral.strategy.Controller;

public class Keyboard implements IController {

    public Keyboard() {

    }

    @Override
    public ControllerData readControllerData() {
        System.out.println("Driving with keyboard");
        return new ControllerData(100, 0); //max w prawo
    }
}
