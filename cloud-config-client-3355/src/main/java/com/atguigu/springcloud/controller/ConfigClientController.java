package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //刷新远程配置的注解  需要发送post http://localhost:3355/actuator/refresh 请求
public class ConfigClientController {

    @Value("${config.info}")
    private String configInfo;

    //http://localhost:3355/configInfo
    @GetMapping("/configInfo")
    public String getConfigInfo() {
        return configInfo;
    }
}
