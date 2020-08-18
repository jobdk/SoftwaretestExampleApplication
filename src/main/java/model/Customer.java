package model;

public class Customer {

    private String name;

    private Bike orderedBike;

    public Customer(String name, Bike orderedBike) {
        this.name = name;
        this.orderedBike = orderedBike;
    }

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bike getOrderedBike() {
        return orderedBike;
    }

    public void setOrderedBike(Bike orderedBike) {
        this.orderedBike = orderedBike;
    }
}
