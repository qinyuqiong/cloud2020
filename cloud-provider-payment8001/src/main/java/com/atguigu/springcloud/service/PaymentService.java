package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author A
 * @date 2022/4/11
 */
public interface PaymentService {
    /**
     * 创建
     *
     * @param payment 实体
     * @return 更新数
     */
    int create(Payment payment);

    /**
     * 查询
     *
     * @param id id
     * @return 实体
     */
    Payment getPaymentById(@Param("id") Long id);
}
