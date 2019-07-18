package com.csl.springcloudconsumer.Interface;

import com.csl.springcloudconsumer.Config.MFeignConfig;
import com.csl.springcloudconsumer.Interface.Impl.MFeignClientFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Feign方案
 * @author csl
 * @create 2019-07-12 15:55
 */
@FeignClient(name = "sc-provider",fallback = MFeignClientFallback.class, configuration = MFeignConfig.class)
public interface MFeignClient {
    // 这是被请求微服务的地址，也就是provider的地址
    @GetMapping(value = "/test/{msg}")
    String sayHelloWorld(@PathVariable("msg") String msg);
    //负载均衡测试接口
    @GetMapping(value = "/test/hi")
    String home(@RequestParam String name);

    @GetMapping(value = "/test/list")
    List<Integer> list();

    @GetMapping(value = "/test/list")
    Integer[] array();
}

