package com.csl.demo.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
