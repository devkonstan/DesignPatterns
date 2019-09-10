package behavioral.mediator.TaxiDispatcher;

public abstract class Driver {

    protected String name;

    public Driver(String name) {
        this.name = name;
    }

    abstract void onNewOrder(String orderDetails);
}
