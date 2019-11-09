package behavioral.strategy.Controller;

//klasa kontekstowa (klient)
public class Robot {
    private Position currentPosition;
    private IController controller;

    public Robot(Position currentPosition, IController controller) {
        this.currentPosition = currentPosition;
        this.controller = controller;
    }

    public Robot(Keyboard keyboard) {
    }

    public Robot(Gamepad gamepad) {
    }

    public void updatePosition(Position position) {
        currentPosition = position;
    }

    //logika sterowania robotem
    public void move() {
        ControllerData controllerData = controller.readControllerData();
    }

    public void changeController(IController newController) {
        controller = newController;
    }
}