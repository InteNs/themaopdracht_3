package main;

import java.util.HashMap;


class Order {
    @SuppressWarnings("unused")
    private final HashMap<Object, Integer> orderList;

    public Order(HashMap<Object, Integer> orderList) {
        this.orderList = orderList;
    }
}
