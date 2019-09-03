package com.csl.dubboproviders.service.Impl;

/**
 * @author csl
 * @create 2019-09-03 9:57
 */

import com.alibaba.dubbo.config.annotation.Service;
import com.csl.dubbointerface.dao.BookService;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by hang on 2018/8/27.
 */
@Service()//注意：这里的service是dubbo的注解com.alibaba.dubbo.config.annotation.Service
public class BookServiceImpl implements BookService {
    @Value("${server.port}")
    String name1;

    @Override
    public String getBook(String name) {
        return "获取到书名为《" + name + "》的信息"+name1;
    }
}

