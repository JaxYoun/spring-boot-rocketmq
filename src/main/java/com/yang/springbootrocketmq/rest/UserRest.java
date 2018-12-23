package com.yang.springbootrocketmq.rest;

import com.maihaoche.starter.mq.base.MessageBuilder;
import com.yang.springbootrocketmq.rocketmq.MyProducer;
import org.apache.rocketmq.common.message.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yang
 * @date: 2018/12/23 23:59
 * @description:
 */
@RestController
@RequestMapping("/user")
public class UserRest {

    @Autowired
    private MyProducer myProducer;

//    https://blog.csdn.net/wd2014610/article/details/81781109
    @GetMapping("/send")
    public String send() {
        Message msg = MessageBuilder.of("===-=-=").topic("yangjianxiong").build();
        this.myProducer.syncSend(msg);
        return "SUCCESS";
    }

}
