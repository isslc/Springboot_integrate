package com.csl.springcloudsleuthzipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;


/**
 * 使用sleuth+zipkin 实现链路追踪服务
 * @author a
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class SpringcloudSleuthZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudSleuthZipkinApplication.class, args);
    }

}
