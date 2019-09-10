package behavioral.strategy.Controller;

public class StrategyDemo {
    public static void main(String[] args) {
        Robot robot = new Robot(new Keyboard());
        robot.move();
        robot.changeController(new Gamepad());
        robot.move();
        robot.updatePosition(new Position(23,25));
    }
}