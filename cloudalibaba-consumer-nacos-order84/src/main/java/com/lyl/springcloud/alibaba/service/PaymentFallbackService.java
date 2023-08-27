package com.lyl.springcloud.alibaba.service;

import com.lyl.springcloud.entities.CommonResult;
import com.lyl.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author liyulong
 * @Date 2021/11/19 21:16
 * @Version 1.0
 **/
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444, "服务降级返回,没有该流水信息", new Payment(id, "errorSerial......"));
    }
}
