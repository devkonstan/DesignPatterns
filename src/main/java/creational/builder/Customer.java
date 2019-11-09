package creational.builder;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;

import java.time.LocalDate;

public class Customer {
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private String pesel;
    private String profession;
    private String city;
    private String country;

    private Customer() {

    }

    private Customer(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public static Customer createWithDefaults() {
        return new Customer("Frank", "Nash");
    }

    public Customer(String name, String lastName, LocalDate birthDate, String pesel, String profession, String city, String country) {
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.pesel = pesel;
        this.profession = profession;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    //pesel jest opcjonalny
    public String getPesel() {
        return pesel;
    }

    public String getProfession() {
        return profession;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", pesel='" + pesel + '\'' +
                ", profession='" + profession + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    public static class Builder {
        private Customer customer;

        //parametry wymagane mozemy wsadzic w konstruktor (name, lastName)
        public Builder(String name, String lastName) {

            customer = new Customer(name, lastName);
        }

        public void setName(String name) {
            customer.name = name;
        }

        public void setLastName(String lastName) {
            customer.lastName = lastName;
        }

        public void setBirthDate(LocalDate birthDate) {
            customer.birthDate = birthDate;
        }

        public void setPesel(String pesel) {
            Regex regex = new Regex("\\d{11}");
            customer.pesel = pesel;
        }

        public void setProfession(String profession) {
            customer.profession = profession;
        }

        public void setCity(String city) {
            customer.city = city;
        }

        public void setCountry(String country) {
            customer.country = country;
        }

        public Customer build() {
            return customer;
        }

    }


    public static class BuilderNew {
        private Customer customer = new Customer();

        public BuilderNew setName(String name) {
            customer.name = name;
            return this;
        }

        public BuilderNew setLastName(String lastName) {
            customer.lastName = lastName;
            return this;
        }

        public BuilderNew bornAt(LocalDate birthDate) {
            customer.birthDate = birthDate;
            return this;
        }

        public BuilderNew withPesel(String pesel) {
            if (pesel.length() != 11) {
                pesel = "not valid";
                customer.pesel = pesel;
            } else {
                customer.pesel = pesel;
            }
            return this;
        }

        public BuilderNew setProfession(String profession) {
            customer.profession = profession;
            return this;
        }

        public BuilderNew livesIn(String city) {
            customer.city = city;
            return this;
        }

        public BuilderNew setCountry(String country) {
            customer.country = country;
            return this;
        }


        public Customer build() {
            return customer;
        }


    }

    public static BuilderNew createCustom(String name, String lastName) {

        return new BuilderNew();
    }

}


