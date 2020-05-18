package com.jkxy.car.api.dao;

import com.jkxy.car.api.pojo.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface OrderDao {
    @Insert("insert into ordermsg(carmessageId,buyer,buyAmount) values(#{carmessageId},#{buyer},#{buyAmount})")
    void insertOrder(Order order);
}
