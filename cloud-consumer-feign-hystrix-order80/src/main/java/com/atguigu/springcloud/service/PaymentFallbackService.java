package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author DWL
 * @date 2022/6/29
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {


    @Override
    public String paymentInfoOK(Integer id) {

        return "-----PaymentFallbackService fall back-paymentInfo_OK ,o(╥﹏╥)o";
    }

    @Override
    public String paymentInfoTimeOut(Integer id) {
        return "-----PaymentFallbackService fall back-paymentInfo_TimeOut ,o(╥﹏╥)o";
    }
}
