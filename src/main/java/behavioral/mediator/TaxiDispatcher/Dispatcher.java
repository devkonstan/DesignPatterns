package behavioral.mediator.TaxiDispatcher;

public interface Dispatcher {

    void addDriver(Driver driver);

    void newOrder(String order);

    void showDetails();
}
