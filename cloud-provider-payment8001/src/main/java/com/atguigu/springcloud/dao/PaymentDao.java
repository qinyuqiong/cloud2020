package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author A
 * @date 2022/4/11
 */
@Mapper
public interface PaymentDao {
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
