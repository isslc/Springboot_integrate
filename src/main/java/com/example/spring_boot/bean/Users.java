package com.example.spring_boot.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Author: Administrator
 * @Date: Created in 11:47 2019/1/2
 * @ClassName SpringBeansTest
 **/
@Setter
@Getter
@ToString
public class Users {
    private int id;
    private String username;
    private String password;
}
