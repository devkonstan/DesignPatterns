package creational.builder;

import java.time.LocalDate;

public class Application {
    public static void main(String[] args) {
        FluentBuilder fb = new FluentBuilder();
        fb.setA(1)
                .setB(2)
                .setC(3);

        User someone = new User.BobTheBuilder()
                .setName("Jan")
                .setAge(24)
                .build();

        System.out.println(someone);


        Customer.Builder customerbuilder = new Customer.Builder("Jan", "Kowalski");
        customerbuilder.setName("John");
        customerbuilder.setLastName("Smith");
        Customer customer1 = customerbuilder.build();

        //fluentBuilder tworzy sie tak zeby dalo sie to czytac jak historyjke
        Customer customer2 = new Customer.BuilderNew()
                .setName("John")
                .setLastName("Smith")
                .withPesel("32324")
                .livesIn("Los Angeles")
                .bornAt(LocalDate.of(1984, 12, 10))
                .build();


        Customer defaultCustomer = Customer.createWithDefaults();

        Customer customer3 = Customer.createCustom("Jan","Kowalski")
                .withPesel("32324")
                .livesIn("Los Angeles")
                .bornAt(LocalDate.of(1984, 12, 10))
                .build();

        Customer customer4 = new Customer("Jan", "Nowak", LocalDate.of(1990, 12, 20), "01", "02", "Szczecin", "Poland");
        System.out.println(customer4.getBirthDate());

        System.out.println(defaultCustomer);
        System.out.println(customer1);
        System.out.println(customer2);
        System.out.println(customer3);
        System.out.println(customer4);
    }
}

