package com.csl.springcloudconsumer.Controller;

import com.csl.springcloudconsumer.Interface.MFeignClient;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

/**
 * 在controller中使用feign
 *
 * @author csl
 * @create 2019-07-12 15:57
 */
@Api(value = "test", description = "测试")
@RestController
public class FeignController {

    @Autowired
    private MFeignClient feignClient;

    @GetMapping("/feign/{wd}")
    @ApiOperation(tags="输入什么显示什么",value="输入什么显示什么")
    public Mono<String> sayHelloWorld(@PathVariable("wd") String parm) {
        String result = feignClient.sayHelloWorld(parm);
        return Mono.just(result);
    }
    @GetMapping("/feign/hi")
    @ApiOperation(tags="负载均衡测试接口",value="负载均衡测试接口")
    public Mono<String> home(@RequestParam String name) {
        String result = feignClient.home(name);
        return Mono.just(result);
    }
    @ApiOperation(tags="显示一个list集合",value="显示一个list集合")
    @GetMapping("/feign/list")
    public Flux<Integer> list() {
        List<Integer> list = feignClient.list();
        Flux<Integer> userFlux = Flux.fromIterable(list);
        return userFlux;
    }
    @ApiOperation(tags="显示一个array集合",value="显示一个array集合")
    @GetMapping("/feign/array")
    public Flux<Integer> array() {
        Integer[] arrays = feignClient.array();
        Flux<Integer> userFlux = Flux.fromArray(arrays);
        return userFlux;
    }
}

