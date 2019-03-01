package com.example.spring_boot.mapper;

import com.example.spring_boot.bean.Users;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;


import java.util.List;

/**
 * @Author: Administrator
 * @Date: Created in 15:39 2019/1/2
 * @ClassName UsersMapper
 **/
@Mapper
@Repository
public interface UsersMapper {

    public Users login(Users users);
    public List<Users> All();

    public boolean sendUsers(Users users);
}
