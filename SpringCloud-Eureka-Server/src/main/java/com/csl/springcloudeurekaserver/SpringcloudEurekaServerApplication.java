package com.csl.springcloudeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka注册中心
 * @author a
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringcloudEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaServerApplication.class, args);
        System.out.println("注册中心(server-eureka)启动成功，请接着启动配置中心(server-config)");
    }

}
