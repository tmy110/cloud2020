package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class OrderHystrixController {



//
//    /**
//     * 正常访问
//     * http://localhost:8001/payment/hystrix/ok/31
//     * @param id
//     * @return
//     */
//    @GetMapping("/payment/hystrix/ok/{id}")
//    public String paymentInfo_OK(@PathVariable("id") Integer id) {
//        String result = paymentService.paymentInfo_OK(id);
//        log.info("*****result:" + result);
//        return result;
//    }
//
//    /**
//     * 超时访问
//     * http://localhost:8001/payment/hystrix/timeout/31
//     * @param id
//     * @return
//     */
//    @GetMapping("/payment/hystrix/timeout/{id}")
//    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
//        String result = paymentService.paymentInfo_TimeOut(id);
//        log.info("*****result:" + result);
//        return result;
//    }
}
