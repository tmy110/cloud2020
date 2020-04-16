package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡路由规则类
 *
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
//        return new RoundRobinRule();//轮训
        return new RandomRule();//随机

    }
}
