package com.example.spring_boot;

import com.example.spring_boot.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private UsersService usersService;
    @Test
    public void contextLoads() {

    }
    @Test
    public void findAl2l() {
        for (int i=0;i<usersService.All().size();i++){

            System.out.println( usersService.All().get(i).getId());;

        }
    }

}

