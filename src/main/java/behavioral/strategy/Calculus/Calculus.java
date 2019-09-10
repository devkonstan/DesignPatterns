package behavioral.strategy.Calculus;

//klasa kontekstowa
public class Calculus {
    private int currentNumber;
    private Aggregator aggregator; //element kompozycji

    public Calculus(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    //ustaw strategie
    public void setAggregator(Aggregator aggregator) {

        this.aggregator = aggregator;
    }

    //metoda kontekstu do uzycia w aplikacji
    public void execute(int number) {

        currentNumber = aggregator.execute(currentNumber, number);
    }

    public int getCurrentNumber() {
        return currentNumber;
    }
}
