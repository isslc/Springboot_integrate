package com.example.spring_boot.conteoller;

import com.example.spring_boot.bean.Users;
import com.example.spring_boot.service.UsersService;
import com.example.spring_boot.util.ResponseUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    @RequestMapping("/sendUser")
    public String sendUser(Users users){
        usersService.sendUsers(users);
        return "redirect:/";
    }
    @RequestMapping("/del/{id}")
    public String del(@PathVariable Integer id){
        usersService.del(id);
        return "redirect:/All";
    }
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
    @RequestMapping("/selectSolo/{username}")
    public String selectSolo(@PathVariable String username, HttpServletResponse response){
        Users users=usersService.selectsolo(username);
        JSONObject result = new JSONObject();
        if (users!=null){
            result.put("data", "<p style=\"color: red\">该用户名已存在</p>");
            result.put("success", true);
            try {
                ResponseUtil.write(response, result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }else{
            result.put("success", false);
            try {
                ResponseUtil.write(response, result);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }


}
