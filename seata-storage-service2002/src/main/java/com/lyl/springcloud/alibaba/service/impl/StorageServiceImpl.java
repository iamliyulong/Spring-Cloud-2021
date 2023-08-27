package com.lyl.springcloud.alibaba.service.impl;

import com.lyl.springcloud.alibaba.dao.StorageDao;
import com.lyl.springcloud.alibaba.service.StorageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @ClassName StorageServiceImpl
 * @Description TODO
 * @Author liyulong
 * @Date 2021/11/19 22:47
 * @Version 1.0
 **/
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    /**
     * 扣减库存
     */
    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("------->storage-service中扣减库存开始");
        storageDao.decrease(productId, count);
        LOGGER.info("------->storage-service中扣减库存结束");
    }
}
 
 

