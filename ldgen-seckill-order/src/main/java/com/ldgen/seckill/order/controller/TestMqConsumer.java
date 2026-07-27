package com.ldgen.seckill.order.controller;

import com.ldgen.seckill.common.config.RabbitMQConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author: ldgen
 * @Date: 2026/6/13 18:20
 * @Version: v1.0.0
 * @Description: 测试消费者
 **/
@Component
@Slf4j
public class TestMqConsumer {

    /**
     * 监听测试队列，收到消息后打印日志
     *
     * @param message
     */
    @RabbitListener(queues = RabbitMQConfig.TEST_QUEUE)
    public void consume(String message) {
        log.info("## 收到测试消息: {}", message);
    }
}

