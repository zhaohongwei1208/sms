package com.royyu.sms.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MessageListener {

    @JmsListener(destination = "spring.boot.queue")
    public void receiveMQMessage(Map<String, Object> map){
        System.out.println(map);
    }
}
