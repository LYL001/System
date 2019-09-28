package com.group5.service;


import com.group5.entity.Choice;
import com.group5.entity.User;
import com.group5.entity.Userinfo;

import javax.servlet.http.HttpSession;

public interface UserService {
     User findByUserName (String username);
     Userinfo userInfo(HttpSession session);
     Choice userChoice(HttpSession session);
     boolean createUser(User user);
     boolean changeInfo(Userinfo userinfo);
     boolean changeIntro(Userinfo userinfo);


}
