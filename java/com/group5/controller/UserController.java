package com.group5.controller;

import com.group5.entity.User;
import com.group5.service.impl.UserServiceImpl;
import com.group5.util.Msg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @RequestMapping("/login")
    public String login() {

        return "login";
    }
    @RequestMapping("/login.do")
    @ResponseBody
    public Msg login_do(User user , HttpSession session){
        Msg message=new Msg();

        Subject currentUser = SecurityUtils.getSubject();
        if(currentUser.isAuthenticated() == false){
            UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(),user.getPassword()) ;
            System.out.println(user.getUsername()+","+user.getPassword());
            try {
                currentUser.login(token);
            }catch (AuthenticationException e) {
                e.getMessage();
                e.printStackTrace();
                message.add("flag","false");
                return message;
            }
            System.out.println("222222");
            message.add("flag","true");
            return message;
        }
        User user1 = (User) SecurityUtils.getSubject().getPrincipal();

        return message;

    }

    @RequestMapping("/di")
    String di() {
        return "edit_data";
    }

    @RequestMapping("/reg.do")
    @ResponseBody
    String reg_do(User user){
        if(userService.createUser(user)){
            return "true";
        }
        else{
            return "false";
        }
    }
}

