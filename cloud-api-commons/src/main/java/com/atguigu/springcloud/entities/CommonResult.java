package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 通用返回值
 *
 * @author A
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    /**
     * 返回码
     */
    private Integer code;
    /**
     * 返回消息
     */
    private String message;
    /**
     * 返回体
     */
    private T data;

    /**
     * 构造
     *
     * @param code    返回码
     * @param message 返回值
     */
    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
