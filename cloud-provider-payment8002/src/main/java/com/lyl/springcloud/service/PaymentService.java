package com.lyl.springcloud.service;

import com.lyl.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther lyl
 * @create 2021/11/9 20:03
 */
public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);

}
 
 

