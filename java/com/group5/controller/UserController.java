package com.group5.controller;

import com.group5.entity.SendMessage;
import com.group5.entity.User;
import com.group5.entity.UserExample;
import com.group5.entity.Userinfo;
import com.group5.service.impl.UserInfoServiceImpl;
import com.group5.service.impl.UserServiceImpl;
import com.group5.util.CreateSalt;
import com.group5.util.JavaEmailSender;
import com.group5.util.Msg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private ServletContext servletContext;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private UserInfoServiceImpl userInfoService;

    private static String code;

    private static String str;
    @RequestMapping("/login")
    public String login() {

        return "login";
    }
    @RequestMapping("/login.do")
    @ResponseBody
    public Msg login_do(User user, HttpSession session ){
        Msg message=new Msg();


            UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(),user.getPassword()) ;
            Subject currentUser = SecurityUtils.getSubject();
            /*if(currentUser!=null){
                currentUser.logout();
            }*/
            //System.out.println(user.getUsername()+","+user.getPassword());
            try {
                currentUser.login(token);
            }catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
                message.add("flag","false");
                return message;
            }
            String permission=userService.userHomeAuthority(user.getUsername());
            message.add("permission",permission);
            message.add("flag","true");
            session.setAttribute("getUser",user);
            return message;
        }
    @RequestMapping("/edit")
    String di() {
        return "edit_data";
    }

    @RequestMapping("logout")
    public String logout(){
        Subject currentUser=SecurityUtils.getSubject();
        currentUser.logout();
        return "login";

    }

    @RequestMapping("/reg.do")
    @ResponseBody
    Msg reg_do(String username,String password,String mail,String type_code){
        Msg message=new Msg();
        System.out.println(username);
        System.out.println(this.code);
        if(!this.code.equals(type_code)){
            message.add("flag","unverified");
        }
        if(userService.usernameOnly(username)){
            message.add("flag","repeat");
        }

        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setMail(mail);
        if(userService.createUser(user)){
            message.add("flag","true");
                    }
        else{
            message.add("flag","false");
        }
        return message;
    }
    @RequestMapping("/userpage")
    String home(){
            return "homepage";
    }

    @RequestMapping("code.do")
    public void code_do(String mail){
        this.code=CreateSalt.crate();
        String title="维纳斯婚恋网";
        String str="欢迎注册维纳斯婚恋网，你本次的验证码是:"+code;
        try {
            JavaEmailSender.sendEmail(mail,title,str);
        } catch (Exception e) {

        }
    }

    @RequestMapping("/homeinfo")
    @ResponseBody
    public Msg homeinfo(HttpSession session){
            Msg message=new Msg();
            Subject currentUser = SecurityUtils.getSubject();
            String username=(String)currentUser.getPrincipal();
            User user=userInfoService.getUser(username);
            Userinfo userinfo=userInfoService.getInfo(username);
            message.add("user",user);
            message.add("info",userinfo);
            return message;
        }
        @RequestMapping("/check.do")
        @ResponseBody
        public Msg check_do(String mail){

            Msg message=new Msg();
            List<User> list=userService.selectUserByMail(mail);
            if(list==null){
                message.add("user","null");
            }
            else {
                this.str = CreateSalt.crate();
                String title = "维纳斯婚恋网";
                String str = "本验证码用于修改密码，你本次的验证码是:" + code;
                try {
                    JavaEmailSender.sendEmail(mail, title, str);
                } catch (Exception e) {
                    message.add("user","error");
                }
                User user=list.get(0);
                message.add("user",user);
            }

          return message;


        }
    /*@RequestMapping("/changepass")
    @ResponseBody
    public Msg change_pass(String newpassword,String mail){

    }*/


}

