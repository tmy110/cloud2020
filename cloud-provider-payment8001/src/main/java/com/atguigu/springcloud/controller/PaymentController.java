package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entitles.CommonResult;
import com.atguigu.springcloud.entitles.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.netflix.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;


//    @Resource
//    private DiscoveryClient discoveryClient;


    //http://127.0.0.1:8001/payment/create?serial=1234
    @PostMapping(value = "/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("********插入结果：" + result);
        if (result > 0) {
            return new CommonResult(200, "插入结果,serverPort:" + serverPort, result);
        } else {
            return new CommonResult(444, "插入失败", null);
        }
    }

    //http://127.0.0.1:8001/payment/get/1
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        System.out.println("21");
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("插入结果：" + paymentById + " 你好呀！");
        if (paymentById != null) {
            return new CommonResult(200, "查询成功！,serverPort:" + serverPort, paymentById);
        } else {
            return new CommonResult(444, "没有对应的记录！查询id：" + id, null);
        }
    }
//    //服务发现 不管用
//    @GetMapping(value = "/payment/discovery")
//    public Object discovery() {
////        discoveryClient.getIn
//        return null;
//    }

}
