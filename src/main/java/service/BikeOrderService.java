package service;

import model.Customer;

public interface BikeOrderService {
    Customer orderCustomBike(String name, String color);
}
