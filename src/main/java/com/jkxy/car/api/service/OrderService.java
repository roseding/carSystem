package com.jkxy.car.api.service;

import com.jkxy.car.api.pojo.Order;

public interface OrderService {
    void insertOrder(Order order) throws Exception;
}
