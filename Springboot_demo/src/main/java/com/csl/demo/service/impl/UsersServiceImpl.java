package com.csl.demo.service.impl;


import com.csl.demo.bean.Users;
import com.csl.demo.mapper.UsersMapper;
import com.csl.demo.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
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

    @CacheEvict( value = "poemInfo" ,allEntries = true)
    @Override
    public boolean sendUsers(Users users) {
        return usersMapper.sendUsers(users);
    }

    @Override
    public Users selectsolo(String username) {
        return usersMapper.selectsolo(username);
    }

    @CacheEvict( value = "poemInfo" ,allEntries = true)
    @Override
    public boolean del(Integer id) {
        return usersMapper.del(id);
    }

    @Cacheable(value="poemInfo" )  //自动根据方法生成缓存
    @Override
    public List<Users> All() {
        System.out.println("All，输出此句代表没有走缓存");

        return usersMapper.All();
    }
}
