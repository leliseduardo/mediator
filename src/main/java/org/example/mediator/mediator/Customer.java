package org.example.mediator.mediator;

public class Customer {

    String name;

    public Customer(String name) {
        this.name = name;
    }

    public String placeOrder(Order order) {
        return Counter.getInstance().receiveOrder(order);
    }
}
