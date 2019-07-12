package com.csl.springcloudconsumer.Config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 配置了feign的打印日志等级
 * @author csl
 * @create 2019-07-12 16:00
 */
@Configuration
public class MFeignConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
