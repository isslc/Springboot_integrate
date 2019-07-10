package com.csl.demo.mapper;


import com.csl.demo.bean.Users;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.ibatis.annotations.Mapper;
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
    public Users selectsolo(String username);
    public List<Users> All();

    public boolean sendUsers(Users users);
    public boolean del(@Param("id") Integer id);
}
