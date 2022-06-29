package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author DWL
 * @date 2022/6/29
 */
@RestController
@Slf4j
@DefaultProperties(defaultFallback = "paymentTimeOutFallbackMethod")
public class OrderHystirxController {
    @Resource
    private PaymentHystrixService paymentHystrixService;

    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfoOK(id);
        return result;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    //@HystrixCommand(fallbackMethod = "paymentTimeOutFallbackMethod", commandProperties = {
    //        @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1500")
    //})
    @HystrixCommand//加了@DefaultProperties属性注解，并且没有写具体方法名字，就用统一全局的
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        String result = paymentHystrixService.paymentInfoTimeOut(id);
        return result;
    }

    /**
     * 注意！如果使用DefaultProperties那该方法是不能有入参的
     * @return
     */
    public String paymentTimeOutFallbackMethod() {
        return "我是消费者80,对方支付系统繁忙请10秒钟后再试或者自己运行出错请检查自己,o(╥﹏╥)o";
    }
}
