package com.group5.controller;

import com.group5.entity.User;
import com.group5.entity.Userinfo;
import com.group5.service.UserInfoService;
import com.group5.util.Msg;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class InfoController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("edit_data_html/person_data")
    public String person_data(){
        return "edit_data_html/person_data";
    }
    @RequestMapping("edit_data_html/soliloquy")
    public String soliloquy(){
        return "edit_data_html/soliloquy";
    }
    @RequestMapping("edit_data_html/criteria")
    public String criteria(){
        return "edit_data_html/criteria";
    }
    @RequestMapping("edit_data_html/photo_album")
    public String photo_album(){
        return "edit_data_html/photo_album";
    }
    @RequestMapping("edit_data_html/edit_password")
    public String edit_password(){
        return "edit_data_html/edit_password";
    }
    @RequestMapping("/save_photos")
    public String save_photos(MultipartFile upload){
        return "login";
    }
    @RequestMapping("/save_head")
    @ResponseBody
    public String save_head(MultipartFile upload){
        userInfoService.upLoadHead(upload);
        return "true";
    }
    @RequestMapping("/information")
    @ResponseBody
    public Msg information(){
        Subject currentUser =SecurityUtils.getSubject();
        String username=(String)currentUser.getPrincipal();
        Msg.success();
        Msg message=new Msg();
        User user=userInfoService.getUser(username);
        Userinfo userinfo=userInfoService.getInfo(username);
        message.add("user",user);
        message.add("info",userinfo);
        return message;
    }
}
