package com.cl.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cl.order.config.OrderRestTemplate;
import com.cl.order.entity.Order;
import com.cl.order.entity.User;
import com.cl.order.mapper.OrderMapper;
import com.cl.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author chen long
 * @data 2022/6/16
 **/
@Service("orderService")
@RequiredArgsConstructor
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    private final RestTemplate restTemplate;
    @Override
    public Order queryOrderById(String orderId) {
        Order order = baseMapper.selectById(orderId);
        //请求的url路径
        String url = "http://userservice/user/"+order.getUserId();
        //利用restTemplate发送http请求，查询用户
        User user = restTemplate.getForObject(url, User.class);
        //将user对象set到order对象
        order.setUser(user);
        return order;
    }
}
