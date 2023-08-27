package com.lyl.springcloud.alibaba.service;

import com.lyl.springcloud.alibaba.domain.Order;

/**
 * @ClassName OrderService
 * @Description TODO
 * @Author liyulong
 * @Date 2021/11/19 22:47
 * @Version 1.0
 **/
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
 
 

