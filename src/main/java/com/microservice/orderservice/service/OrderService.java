package com.microservice.orderservice.service;

import com.microservice.orderservice.model.OrderRequest;
import com.microservice.orderservice.model.OrderResponse;

public interface OrderService {

    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
