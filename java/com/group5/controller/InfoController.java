package com.group5.controller;

import com.alibaba.fastjson.JSONObject;
import com.group5.dao.EduMapper;
import com.group5.entity.Edu;
import com.group5.entity.User;
import com.group5.entity.Userinfo;
import com.group5.service.EduService;
import com.group5.service.UserInfoService;
import com.group5.service.UserService;
import com.group5.util.Msg;
import com.group5.util.Old;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class InfoController {
    @Autowired
    private UserService userService;
    @Autowired
    EduService eduService;
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
        if(userinfo.getEduId()!=null){
            Edu edu=eduService.getEdu(userinfo.getEduId());
            message.add("edu",edu);
        }
        message.add("user",user);
        message.add("info",userinfo);
        return message;
    }
    @RequestMapping("/updateinfo")
    @ResponseBody
    public Msg updateinfo(@RequestBody JSONObject data){
        Msg message=new Msg();
        Userinfo userinfo=new Userinfo();
        System.out.println((String)data.get("username"));
        User user=userService.findByUserName((String)data.get("username"));

        userinfo.setId(user.getId());
        Userinfo newUserinfo=new Userinfo();
        if(data.get("gender")!=null){
            if(((String)data.get("gender")).equals("male")){
                userinfo.setGender(1);
            }else{
                userinfo.setGender(2);
            }
        }
        if(data.get("year")!=null&&data.get("month")!=null&&data.get("date")!=null) {
            String birthday = (String) data.get("year") + "-" + (String) data.get("month") + "-" +
                    (String) data.get("date");

            System.out.println(birthday);
            userinfo.setBirthday(birthday);
            Integer age = Old.getYearsOld(birthday);
            userinfo.setAge(age);
        }
        if(data.get("education")!=null){
                Edu edu=eduService.getEduByName((String)data.get("education"));
                userinfo.setEduId(edu.getId());
            }
        if(data.get("province")!=null&&data.get("city")!=null){
                String location=(String)data.get("province")+(String)data.get("city");
                userinfo.setSituation(location);
            }
        if(data.get("height")!=null){
                Float height=Float.parseFloat((String)data.get("height"));
                userinfo.setHeight(height);
            }
        if(data.get("weight")!=null){
                Float weight=Float.parseFloat((String)data.get("weight"));
                userinfo.setWeight(weight);
            }
        if(data.get("salary")!=null){
                Float salary=Float.parseFloat((String)data.get("salary"));
                userinfo.setSalary(salary);
            }
        if(userInfoService.updateUserinfo(user.getId(),userinfo)){
                message.add("flag","true");
            }
        else{
                message.add("flag","false");
            }

        return message;
    }
    @RequestMapping("/updateIntro")

    public void updateIntro(Userinfo userinfo){

        Subject currentUser =SecurityUtils.getSubject();
        String username=(String)currentUser.getPrincipal();
        User user=userService.findByUserName(username);
        userinfo.setId(user.getId());
        userInfoService.updateIntro(userinfo);

    }
}
