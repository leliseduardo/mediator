package org.example.mediator.mediator;
public class Counter implements Department {

    private static Counter instance = new Counter();

    private Counter() {}

    public static Counter getInstance() {
        return instance;
    }

    public String receiveOrder(Order order) {
        return Kitchen.getInstance().receiveOrder(order);
    }
}

