package behavioral.strategy.Calculus;

import java.util.Random;

//klasa kontekstowa (klient)
public class Calculus {
    //elementy kompozycji
    private int currentNumber;
    private Aggregator aggregator;

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
