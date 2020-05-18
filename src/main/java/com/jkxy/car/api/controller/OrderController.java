package com.jkxy.car.api.controller;

import com.jkxy.car.api.pojo.Order;
import com.jkxy.car.api.service.OrderService;
import com.jkxy.car.api.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    /**
     * 新增订单
     *
     * @return
     */
    @PostMapping("/insertOrder")
    public JSONResult insertCar(Order order) throws Exception {
        orderService.insertOrder(order);
        return JSONResult.ok();
    }
}
