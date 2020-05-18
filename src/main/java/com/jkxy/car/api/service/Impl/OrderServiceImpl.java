package com.jkxy.car.api.service.Impl;

import com.jkxy.car.api.dao.CarDao;
import com.jkxy.car.api.dao.OrderDao;
import com.jkxy.car.api.pojo.Car;
import com.jkxy.car.api.pojo.Order;
import com.jkxy.car.api.service.CarService;
import com.jkxy.car.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CarService carService;

    @Autowired
    private CarDao carDao;

    @Override
    @Transactional
    public void insertOrder(Order order) throws Exception {
        Car car = new Car();
        if(!StringUtils.isEmpty(order.getCarmessageId())){
            car = carService.findById(order.getCarmessageId());
        }else{
            throw new Exception("车系ID不能为空");
        }

        if(!StringUtils.isEmpty(car.getCarInventory()) && car.getCarInventory()>=order.getBuyAmount()){
            orderDao.insertOrder(order);
            car.setCarInventory(car.getCarInventory()-order.getBuyAmount());
            System.out.println(car.getCarInventory());
            carDao.updateById(car);
        }else {
            throw new Exception("库存不足");
        }

    }
}
