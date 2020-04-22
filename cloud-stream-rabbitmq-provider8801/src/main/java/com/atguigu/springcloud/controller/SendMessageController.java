package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 *
 * @author zzyy
 */
@RestController
public class SendMessageController {

    @Resource
    private IMessageProvider messageProvider;
    //http://127.0.0.1:8801/sendMessage
    @GetMapping("/sendMessage")
    public String sendMessage(){
         return messageProvider.send();
    }
}
