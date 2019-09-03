package com.csl.dubboproviders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.TimeUnit;

/**
 * Created by hang on 2018/8/29.
 */
@SpringBootApplication
public class DubboProvidersApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(DubboProvidersApplication.class, args);
        TimeUnit.MINUTES.sleep(10); //提供者main线程暂停10分钟等待被调用
        System.err.println("服务提供者------>>服务关闭");
    }
//    @Override
//    public void run(String... strings) throws Exception {
//        System.err.println("服务提供者------>>启动完毕");
//    }
}

