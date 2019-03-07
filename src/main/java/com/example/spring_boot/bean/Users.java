package com.example.spring_boot.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

/**
 * @Author: Administrator
 * @Date: Created in 11:47 2019/1/2
 * @ClassName SpringBeansTest
 **/
@Setter
@Getter
@ToString
/*Serializable序列化*/
public class Users implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String username;
    private String password;

}
