package com.example.spring_boot.service.impl;

import com.example.spring_boot.bean.Users;
import com.example.spring_boot.mapper.UsersMapper;
import com.example.spring_boot.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Administrator
 * @Date: Created in 15:39 2019/1/2
 * @ClassName UsersServiceImpl
 **/
@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersMapper usersMapper;


    @Override
    public Users login(Users users) {
        return usersMapper.login(users);
    }

    @Override
    public boolean sendUsers(Users users) {
        return usersMapper.sendUsers(users);
    }

    @Cacheable(cacheNames="userList")
    @Override
    public List<Users> All() {
        System.out.println("All，输出此句代表没有走缓存");

        return usersMapper.All();
    }
}
