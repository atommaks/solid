package ru.atom.solid.isp.solution;

import ru.atom.solid.isp.violation.Order;

public interface OrderService {
    Order createOrder();
    Order amendOrder();
    boolean cancelOrder(int orderId);
    Order submitOrder(int orderId);
    Order getOrder(int orderId);
}
