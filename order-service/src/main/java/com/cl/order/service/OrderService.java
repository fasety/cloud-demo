package com.cl.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cl.order.entity.Order;

/**
 * @author chen long
 * @data 2022/6/16
 **/
public interface OrderService extends IService<Order> {

    /**
     * 获取订单信息
     * @param orderId: 订单id
     * @return: 订单信息
     * @author chen long
     * @date:  11:42
     **/
    Order queryOrderById(String orderId);
}
