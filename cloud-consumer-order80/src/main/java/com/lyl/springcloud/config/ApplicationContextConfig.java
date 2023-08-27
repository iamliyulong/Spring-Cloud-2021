package com.lyl.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description RestTemplate配置类
 * @Author liyulong
 * @Date 2021/11/9 21:17
 * @Version 1.0
 **/
@Configuration
public class ApplicationContextConfig {

    @Bean
    //ribbon负载均衡
//    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
