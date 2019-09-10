package behavioral.strategy.Calculus;

import java.util.Random;

public class StrategyDemo {
    public static void main(String[] args) {
        Calculus calculus = new Calculus(new SumAggregator());
        System.out.println("Using SumAggregator");
        doIt(calculus);
        System.out.println("Changing to MinusAggregator");
        calculus.setAggregator(new MinusAggregator());
        doIt(calculus);
    }

    private static void doIt(Calculus calculus) {
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            calculus.execute(1);
            System.out.println("Current: " + calculus.getCurrentNumber());
        }
    }
}
