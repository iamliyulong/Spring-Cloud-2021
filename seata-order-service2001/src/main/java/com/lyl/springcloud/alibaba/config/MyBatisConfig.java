package com.lyl.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description TODO
 * @Author liyulong
 * @Date 2021/11/19 22:49
 * @Version 1.0
 **/
@Configuration
@MapperScan({"com.lyl.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
 
 

