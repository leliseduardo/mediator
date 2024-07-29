package org.example.mediator.mediator;

import java.util.ArrayList;
import java.util.List;

public class Kitchen implements Department {

    private List<Order> receivedOrders = new ArrayList<>();

    private static Kitchen instance = new Kitchen();

    private Kitchen() {}

    public static Kitchen getInstance() {
        return instance;
    }

    @Override
    public String receiveOrder(Order order) {
        this.receivedOrders.add(order);
        return "Order received in the kitchen";
    }
}

