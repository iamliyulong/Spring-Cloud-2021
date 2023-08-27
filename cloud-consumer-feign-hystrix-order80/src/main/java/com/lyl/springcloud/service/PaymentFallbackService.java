package com.lyl.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @auther zzyy
 * @create 2019-11-12 11:12
 */
@Component //必须加 //必须加 //必须加
public class PaymentFallbackService implements PaymentHystrixService
{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_OK，呜呜呜";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut，呜呜呜";
    }
}
 
 
 

