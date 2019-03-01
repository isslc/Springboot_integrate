package com.example.spring_boot.service;

import com.example.spring_boot.bean.Users;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: Created in 15:38 2019/1/2
 * @ClassName UsersService
 **/
public interface UsersService {
    public Users login(Users users);
    public boolean sendUsers(Users users);
    public List<Users> All();
}
