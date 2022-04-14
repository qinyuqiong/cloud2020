package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @author A
 * @date 2022/4/11
 */
@RestController
public class OrderController {
    public static final String PAYMENT_SRV_URL = "http://CLOUD-PAYMENT-SERVICE";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 客户端用浏览器是get请求，但是底层实质发送post调用服务端8001
     *
     * @param payment 实体
     * @return 结果
     */
    @PostMapping("/consumer/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_SRV_URL + "/payment/create", payment, CommonResult.class);
    }

    /**
     * 查询
     *
     * @param id id
     * @return 结果
     */
    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult getPayment(@PathVariable Long id) {
        return restTemplate.getForObject(PAYMENT_SRV_URL + "/payment/get/" + id, CommonResult.class, id);
    }
}
