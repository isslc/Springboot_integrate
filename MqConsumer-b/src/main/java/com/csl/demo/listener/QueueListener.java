package com.csl.demo.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author csl
 * //Queue点对点
 * @create 2019-07-11 11:01
 */
@Component
public class QueueListener {

    @JmsListener(destination = "publish.queue", containerFactory = "jmsListenerContainerQueue")
    @SendTo("out.queue")
    public String receive(String text){
        System.out.println("QueueListener: consumer-b 收到一条信息: " + text);
        return "consumer-a received : " + text;
    }
}