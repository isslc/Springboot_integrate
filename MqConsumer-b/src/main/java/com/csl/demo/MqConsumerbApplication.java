package com.csl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 消费者A
 * @author a
 */
@SpringBootApplication
public class MqConsumerbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqConsumerbApplication.class, args);
    }

}
