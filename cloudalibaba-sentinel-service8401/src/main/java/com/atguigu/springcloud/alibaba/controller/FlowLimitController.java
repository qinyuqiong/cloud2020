package com.atguigu.springcloud.alibaba.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DWL
 * @date 2022/7/5
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        //try {
        //    TimeUnit.MILLISECONDS.sleep(800);
        //} catch (InterruptedException e) {
        //    e.printStackTrace();
        //}
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "------testB";
    }

    @GetMapping("/testD")
    public String testD(){
        int age = 10/0;
        return "---testD";
    }
}
