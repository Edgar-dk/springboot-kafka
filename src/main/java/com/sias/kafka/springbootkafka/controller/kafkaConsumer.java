package com.sias.kafka.springbootkafka.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author Edgar
 * @create 2022-09-22 20:43
 * @faction:
 */
@Configuration
public class kafkaConsumer {

    @KafkaListener(topics = "first")
    public void over(String msgg){
        System.out.println("收到了消息："+msgg);
    }
}
