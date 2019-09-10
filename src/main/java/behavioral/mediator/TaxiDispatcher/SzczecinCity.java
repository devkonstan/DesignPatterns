package behavioral.mediator.TaxiDispatcher;

public class SzczecinCity {

    public static void main(String[] args) {
        Dispatcher taxiDispatcher = new TaxiDispatcher();
        Driver driver1 = new TaxiDriver("Jan Kowalski");
        Driver driver2 = new TaxiDriver("Wacław Nowak");
        Driver driver3 = new TaxiDriver("Jerzy Jerzyk");
        taxiDispatcher.addDriver(driver1);
        taxiDispatcher.addDriver(driver2);
        taxiDispatcher.addDriver(driver3);
        taxiDispatcher.showDetails();
        System.out.println("Zlecenenie nr 1");
        taxiDispatcher.newOrder("Galeria Kaskada od strony Niepodlegóści");
        taxiDispatcher.showDetails();
        System.out.println("Zlecenie nr 2");
        taxiDispatcher.newOrder("Centrum Handlowe Galaxy");
        taxiDispatcher.showDetails();
        System.out.println("Zlecenie nr 3");
        taxiDispatcher.newOrder("Centrum Handlowe Turzyn");
        taxiDispatcher.showDetails();
        System.out.println("Zlecenie nr 4");
        taxiDispatcher.newOrder("Centrum Handlowe Molo");
        taxiDispatcher.showDetails();
    }
}
