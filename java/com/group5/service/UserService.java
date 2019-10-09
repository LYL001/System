package com.group5.service;


import com.group5.entity.Choice;
import com.group5.entity.User;
import com.group5.entity.Userinfo;
import org.springframework.context.ApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {
     User findByUserName (String username);
     Userinfo userInfo(HttpSession session);
     Choice userChoice(HttpSession session);
     String userHomeAuthority(String username);
     boolean logIsRepeat(ServletContext context, User user);
     boolean createUser(User user);
     boolean changeInfo(Userinfo userinfo);
     boolean changeIntro(Userinfo userinfo);
     void singleUseLogin(String loginName);
     boolean usernameOnly(String username);
     List<User> selectUserByMail(String mail);
     boolean mailOnly(String mail);
     boolean updatePass(String newpassword,String mail);
     boolean updateUser(User newUser,String oldUSername);


}
