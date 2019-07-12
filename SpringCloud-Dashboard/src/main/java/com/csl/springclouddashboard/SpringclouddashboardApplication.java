package com.csl.springclouddashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * 用hystrix-turbine-dashboard 做集群监控
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class SpringclouddashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringclouddashboardApplication.class, args);
    }

}
