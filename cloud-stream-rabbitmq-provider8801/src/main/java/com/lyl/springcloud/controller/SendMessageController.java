package com.lyl.springcloud.controller;

import com.lyl.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName SendMessageController
 * @Description TODO
 * @Author liyulong
 * @Date 2021/11/14 21:37
 * @Version 1.0
 **/
@RestController
public class SendMessageController {

    @Autowired
    private IMessageProvider iMessageProvider;

    @GetMapping(value = "/sendMessage")
    public String sendMessage()
    {
        return iMessageProvider.send();
    }

}
