package com.yang.springbootrocketmq.rocketmq;

import com.maihaoche.starter.mq.annotation.MQConsumer;
import com.maihaoche.starter.mq.base.AbstractMQPushConsumer;

import java.util.Map;

/**
 * @author: Yang
 * @date: 2018/12/23 23:57
 * @description:
 */
@MQConsumer(topic = "yangjianxiong", consumerGroup = "group_con_yang")
public class MyConsumer extends AbstractMQPushConsumer {

    @Override
    public boolean process(Object o, Map map) {
        System.out.println(o.toString());
        System.out.println(map.toString());
        return false;
    }

}
