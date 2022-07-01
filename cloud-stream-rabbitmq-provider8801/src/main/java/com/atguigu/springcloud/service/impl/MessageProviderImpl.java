package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.service.IMessageProvider;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * 可以理解为是一个消息的发送管道的定义
 *
 * @author DWL
 * @date 2022/7/1
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    /**
     * 消息的发送管道
     */
    @Resource
    @Output(Source.OUTPUT)
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();
        // 创建并发送消息
        this.output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("***serial: " + serial);

        return serial;
    }
}
