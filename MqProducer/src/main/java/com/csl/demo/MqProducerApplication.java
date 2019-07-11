package com.csl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 生产者
 * @author a
 */
@SpringBootApplication
public class MqProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MqProducerApplication.class, args);
    }

}
