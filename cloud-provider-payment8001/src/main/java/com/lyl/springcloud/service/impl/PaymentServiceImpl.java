package com.lyl.springcloud.service.impl;

import com.lyl.springcloud.dao.PaymentDao;
import com.lyl.springcloud.entities.Payment;
import com.lyl.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @auther lyl
 * @create 2021/11/9 20:03
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    /**
     * @Autowired或者
     * @Resource
     */
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
 
 

