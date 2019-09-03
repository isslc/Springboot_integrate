package com.csl.dubboconsumers;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 实现CommandLineRunner这个接口是为了重写它的run方法，
 * 启动完成以后会自动执行run方法的内容。
 * Created by hang on 2018/8/29.
 */
@SpringBootApplication
public class DubboConsumersApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumersApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.err.println("服务调用者------>>启动完毕");
    }

}

