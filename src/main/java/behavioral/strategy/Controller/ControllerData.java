package behavioral.strategy.Controller;

public class ControllerData {
    private final int xAxis;
    private final int yAxis;

    public ControllerData(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getxAxis() {
        return xAxis;
    }

    public int getyAxis() {
        return yAxis;
    }
}
