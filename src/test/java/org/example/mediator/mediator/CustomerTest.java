package org.example.mediator.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void shouldPlaceOrder() {
        Customer customer = new Customer("Jubisvaldo");
        Order order = new Order("Paella", 35.70);
        assertEquals("Order received in the kitchen", customer.placeOrder(order));
    }
}
