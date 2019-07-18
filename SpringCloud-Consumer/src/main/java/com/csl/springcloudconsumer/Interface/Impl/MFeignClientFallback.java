package com.csl.springcloudconsumer.Interface.Impl;

import com.csl.springcloudconsumer.Interface.MFeignClient;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 断路器要实现MFeignClient接口，请求失败，进入断路器时，会回调这里的方法。
 * @author csl
 * @create 2019-07-12 15:59
 */
@Component
public class MFeignClientFallback implements MFeignClient {
    @Override
    public String sayHelloWorld(String msg) {
        return "fallback";
    }

    @Override
    public String home(String msg) {
        return "home";
    }

    @Override
    public List<Integer> list() {
        return new ArrayList<>();
    }

    @Override
    public Integer[] array() {
        return new Integer[0];
    }
}
