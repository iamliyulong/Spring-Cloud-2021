package com.lyl.springcloud.alibaba.controller;

import com.lyl.springcloud.alibaba.domain.CommonResult;
import com.lyl.springcloud.alibaba.domain.Order;
import com.lyl.springcloud.alibaba.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author liyulong
 * @Date 2021/11/19 22:49
 * @Version 1.0
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    /**
     * 创建订单
     */
    @GetMapping("/order/create")
    public CommonResult create(Order order) {
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
 
 

