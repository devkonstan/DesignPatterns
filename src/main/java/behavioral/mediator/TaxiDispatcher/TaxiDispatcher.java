package behavioral.mediator.TaxiDispatcher;

import java.util.LinkedList;
import java.util.Queue;

public class TaxiDispatcher implements Dispatcher {

    Queue<Driver> drivers = new LinkedList<>();
    Queue<Driver> driversWithCourse = new LinkedList<>();

    @Override
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    @Override
    public void newOrder(String order) {
        if (!drivers.isEmpty()) { //jesli jest ktos na liscie
            Driver driver = drivers.poll(); //sciaga 1. kierowce z listy wolnych kierowcow
            driver.onNewOrder(order); //kierowca dostaje kurs
            driversWithCourse.add(driver); //trafia na liste zajetych
        } else {
            System.out.println("No drivers ready!");
        }
    }

    @Override
    public void showDetails() {
        System.out.println("Drivers with course: " + driversWithCourse);
        System.out.println("Drivers waiting: " + drivers);
    }

}
