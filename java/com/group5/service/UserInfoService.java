package com.group5.service;

import com.group5.entity.User;
import com.group5.entity.Userinfo;
import org.springframework.web.multipart.MultipartFile;

public interface UserInfoService {
    Userinfo getInfo (String username);
    User getUser(String username);
    boolean changeInfo(Userinfo userinfo);
    boolean upLoadHead(MultipartFile upload);
    boolean updateUserinfo(Integer userId,Userinfo userinfo);
}
