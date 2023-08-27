package com.lyl.springcloud.alibaba.service;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * @ClassName StorageService
 * @Description TODO
 * @Author liyulong
 * @Date 2021/11/19 22:47
 * @Version 1.0
 **/
public interface StorageService {

    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);

}

 
 

