package behavioral.strategy.Calculus;

public class SumAggregator implements Aggregator {
    @Override
    public int execute(int current, int number) {
        return current + number;
    }
}
