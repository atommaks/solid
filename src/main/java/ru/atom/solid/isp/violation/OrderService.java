package ru.atom.solid.isp.violation;

public interface OrderService {
    Order createOrder();
    Order amendOrder();
    boolean cancelOrder(int orderId);
    Order submitOrder(int orderId);
    Order getOrder(int orderId);
    boolean processOrder(int orderId);
}
