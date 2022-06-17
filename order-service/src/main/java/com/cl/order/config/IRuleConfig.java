package com.cl.order.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author chen long
 * @data 2022/6/16
 **/
public class IRuleConfig {
    @Bean
    public IRule randomRule() {
        return new RandomRule();
    }
}
