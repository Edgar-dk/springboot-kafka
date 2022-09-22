package com.sias.kafka.springbootkafka.controller;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Edgar
 * @create 2022-09-22 20:10
 * @faction:
 */
@RestController
public class ProducerConsumer {

    @Resource
    KafkaTemplate<String,String> kafkaProducer;

    @RequestMapping("/sias")
    public String Test(String msg){
        kafkaProducer.send("first",msg);
        return "ok";
    }
}
