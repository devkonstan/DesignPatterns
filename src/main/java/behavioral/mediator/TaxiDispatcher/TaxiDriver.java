package behavioral.mediator.TaxiDispatcher;

public class TaxiDriver extends Driver {

    public TaxiDriver(String name) {
        super(name);
    }

    @Override
    void onNewOrder(String orderDetails) {
        System.out.println("Taxi driver: " + name + " received order-> " + orderDetails);
    }

    @Override
    public String toString() {
        return "TaxiDriver{" +
                "name='" + name + '\'' +
                '}';
    }
}
