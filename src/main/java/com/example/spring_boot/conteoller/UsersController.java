package com.example.spring_boot.conteoller;

import com.example.spring_boot.bean.Users;
import com.example.spring_boot.service.UsersService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author: Administrator
 * @Date: Created in 15:40 2019/1/2
 * @ClassName UsersController
 **/
@Controller
public class UsersController {

    @Autowired
    private UsersService usersService;
    /*@RequestMapping("/")
    public String login(){
        return "/login.html";
    }
*/
/*    @RequestMapping("/sendUser")
    public String sendUser(Users users){
        System.out.println(users);
        usersService.sendUsers(users);
        return "redirect:/login";
    }*/

    @RequestMapping("/login")
    public String login(Users users, HttpServletRequest request, HttpSession session){
        Users users1=usersService.login(users);
        if (users1!=null){
            session.setAttribute("loginUser",users.getUsername());
            return "redirect:/main.html";
        }else {
            if (users.getUsername()!=null&&users.getUsername()!=""){
                request.setAttribute("msg","用户名密码错误");
                return null;
            }else{
                return "redirect:/";
            }
        }
    }

    @RequestMapping("/All")
    public String selectUser(HttpServletRequest request){
        request.setAttribute("ulist",usersService.All());
        return "/index";
    }

}
