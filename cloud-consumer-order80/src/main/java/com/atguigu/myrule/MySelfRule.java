package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * @author yuqiong
 * @date 2022/5/17
 */
@Configuration
public class MySelfRule {
    public IRule MyRule() {
        //随机
        return new RandomRule();
    }
}
