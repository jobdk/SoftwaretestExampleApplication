package service;

import model.Customer;

/**
 * diese Klasse wird ist für den Integrationstest
 * dieser befindet sich in src/it/..
 */

public class BikeOrderService {

    private BikeBuildingService bikeBuildingService = new BikeBuildingService();

    public Customer orderCustomBike(String name, String color) {
        Customer customer = new Customer();
        customer.setName(name);
        customer.setOrderedBike(bikeBuildingService.createCustomBike(color));
        return customer;
    }

}
