package com.lyl.springcloud.service.impl;

import cn.hutool.core.util.IdUtil;
import com.lyl.springcloud.service.IMessageProvider;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

/**
 * @ClassName MessageProviderImpl
 * @Description 发送消息接口实现类
 * @Author liyulong
 * @Date 2021/11/14 21:23
 * @Version 1.0
 **/
@EnableBinding(Source.class)//可以理解为是一个消息的发送管道的定义
@Slf4j
public class MessageProviderImpl implements IMessageProvider {

    @Resource
    /**
     * 消息的发送管道
     */
    private MessageChannel output;

    @Override
    public String send() {
        String serial = IdUtil.simpleUUID();
        output.send(MessageBuilder.withPayload(serial).build());
        log.info("***serial: "+serial);
        return serial;
    }
}
