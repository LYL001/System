package com.group5.service.impl;

import com.group5.dao.UserMapper;
import com.group5.dao.UserinfoMapper;
import com.group5.entity.*;
import com.group5.service.UserInfoService;
import com.group5.util.UpLoad;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserinfoMapper userinfoMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public Userinfo getInfo(String username) {

        UserinfoExample userinfoExample=new UserinfoExample();
        UserinfoExample.Criteria criteria=userinfoExample.createCriteria();
        Userinfo userinfo=userinfoMapper.selectByUsername(username);
        return userinfo;
    }

    @Override
    public User getUser(String username){

        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> list=userMapper.selectByExample(userExample);
        return  list.get(0);
    }

    @Override
    public boolean changeInfo(Userinfo userinfo) {
        return false;
    }

    @Override
    public boolean upLoadHead(MultipartFile upload) {
        UpLoad upLoad=new UpLoad();
        upLoad.upLoadFile(upload);
        return true;
    }

    @Override
    public boolean updateUserinfo(Integer userId, Userinfo userinfo) {
        UserinfoExample example=new UserinfoExample();
        UserinfoExample.Criteria criteria=example.createCriteria();
        criteria.andIdEqualTo(userId);
        if(userinfoMapper.updateByExampleSelective(userinfo,example)>0){
            return true;
        }
        else {
            return false;
        }
    }
}
