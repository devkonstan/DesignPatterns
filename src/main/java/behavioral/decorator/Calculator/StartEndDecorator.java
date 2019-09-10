package behavioral.decorator.Calculator;

import creational.singleton.SingletonLogger;

public class StartEndDecorator extends Calculator {

    private final Calculator calculator;

    public StartEndDecorator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int a, int b) {
        SingletonLogger.getSL().log("Start");
        int result = calculator.add(a, b);
        SingletonLogger.getSL().log("End");
        return result;
    }

    @Override
    public int subtract(int a, int b) {
        SingletonLogger.getSL().log("Start");
        int result = calculator.subtract(a, b);
        SingletonLogger.getSL().log("End");
        return result;
    }
}
