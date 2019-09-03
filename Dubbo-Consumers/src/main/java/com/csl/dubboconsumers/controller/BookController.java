package com.csl.dubboconsumers.controller;

/**
 * @author csl
 * @create 2019-09-03 9:52
 */


import com.csl.dubbointerface.dao.BookService;
import com.reger.dubbo.annotation.Inject;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hang on 2018/8/29.
 */
@RestController
@Component//启动时调用
public class BookController implements CommandLineRunner {

    // 使用兼容注入，可以使用dubbo原生注解@Reference注入
    @Inject
    public BookService service;
    // 使用兼容注入
    @Inject
    public BookService bidService;
    @Override
    public void run(String... args){
        String name="system start";
        System.out.println(service.getBook(name));
        System.out.println("调用完成");
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String  run(String name){

        name= name==null?"system start":name;

        return service.getBook(name);
    }
}

