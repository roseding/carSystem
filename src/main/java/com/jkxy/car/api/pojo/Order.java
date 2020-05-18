package com.jkxy.car.api.pojo;

import javax.validation.constraints.NotBlank;
import java.util.Date;

public class Order {
    //订单ID
    private int orderId;

    @NotBlank(message = "车系Id不能为空")
    //车辆号
    private int carmessageId;

    //购车人
    private String buyer;

    //购车数量
    private int buyAmount;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getCarmessageId() {
        return carmessageId;
    }

    public void setCarmessageId(int carmessageId) {
        this.carmessageId = carmessageId;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    public int getBuyAmount() {
        return buyAmount;
    }

    public void setBuyAmount(int buyAmount) {
        this.buyAmount = buyAmount;
    }
}
