package com.group5.service.impl;

        import com.group5.dao.AuthorityMapper;
        import com.group5.dao.ChoiceMapper;
        import com.group5.dao.UserMapper;
        import com.group5.dao.UserinfoMapper;
        import com.group5.entity.*;
        import com.group5.listener.LogLisener;
        import com.group5.service.UserService;
        import org.apache.shiro.SecurityUtils;
        import org.apache.shiro.crypto.SecureRandomNumberGenerator;
        import org.apache.shiro.crypto.hash.Md5Hash;
        import org.apache.shiro.session.Session;
        import org.apache.shiro.session.SessionListener;
        import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
        import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import sun.security.provider.MD5;

        import javax.servlet.ServletContext;
        import javax.servlet.http.HttpSession;
        import java.util.ArrayList;
        import java.util.Collection;
        import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserinfoMapper userinfoMapper;
    @Autowired
    private ChoiceMapper choiceMapper;
    @Autowired
    private AuthorityMapper authorityMapper;


    @Override
    public User findByUserName(String username) {
        User user=new User();
        List<User> list=new ArrayList<User>();
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
    list=userMapper.selectByExample(userExample);
        if(list != null ){
        user=list.get(0);
    }else{
        user=null;
    }
        return user;
}

    @Override
    public Userinfo userInfo(HttpSession session) {
        return null;
    }

    @Override
    public Choice userChoice(HttpSession session) {
        return null;
    }

    @Override
    public boolean createUser(User user) {
        String salt=new SecureRandomNumberGenerator().nextBytes().toHex();
        String result=new Md5Hash(user.getPassword(),salt,3).toString();
        UserExample example=new UserExample();
        user.setPassword(result);
        user.setSalt(salt);
        user.setAuthority(2);

        userMapper.insertSelective(user);
        Userinfo userinfo=new Userinfo();
        Choice  choice=new Choice();
        //获取刚创建的user的id
        User c_user=new User();
        UserExample userExample=new UserExample();
        UserExample.Criteria userExampleCriteria=userExample.createCriteria();
        userExampleCriteria.andUsernameEqualTo(user.getUsername());
        List <User> users=userMapper.selectByExample(userExample);
        //将三张表关联起来
        if(users!= null ){
            c_user=users.get(0);
            userinfo.setId(c_user.getId());
            choice.setUserId(c_user.getId());
            userinfoMapper.insertSelective(userinfo);
            choiceMapper.insertSelective(choice);
        }else{
            c_user=null;
        }


        return true;
    }

    @Override
    public boolean changeInfo(Userinfo userinfo) {
        return false;
    }

    @Override
    public boolean changeIntro(Userinfo userinfo) {
        return false;
    }

    @Override
    public boolean logIsRepeat(ServletContext context, User user) {
        String username=user.getUsername();
        if(context.getAttribute(username)==null){
            return false;
        }else
        {
            return  true;
        }
    }

    @Override
    public String userHomeAuthority(String username) {
        String flag=null;
        List<String> list=authorityMapper.selectByUsername(username);
        for(String permission:list){
            if(permission.equals("Admin:log")){
                flag="Admin:log";
            }
            if(permission.equals("user:log")){
                flag="user:log";
            }
            if(permission.equals("VIP:log")){
                flag="VIP:log";
            }
        }
        return flag;
    }


    @Override
    public void singleUseLogin(String loginName){
        // 1.获取当前用户sessionId
        String currentUserSessionId = SecurityUtils.getSubject().getSession().getId().toString();
        // 2.获取当前用户
        String  username = (String) SecurityUtils.getSubject().getPrincipal();
        // 3.获取shiro的sessionManager
        DefaultWebSecurityManager securityManager = (DefaultWebSecurityManager) SecurityUtils.getSecurityManager();
        DefaultWebSessionManager sessionManager = (DefaultWebSessionManager)securityManager.getSessionManager();
        // 4.获取所有已登录用户的session列表
        Collection<Session> sessions = sessionManager.getSessionDAO().getActiveSessions();

        if (sessions.size() > 1) {
            System.out.println("仅允许单用户登录,开始清理遗留用户信息~");
            for(Session onlineSession:sessions){
                // 5. 清除当前用户以前登录时保存的session会话
                if (loginName.equals(username) && !onlineSession.getId().equals(currentUserSessionId)) {
                    sessionManager.getSessionDAO().delete(onlineSession);
                    System.out.println("清理用户["+loginName+"],SessionId为["+onlineSession.getId()+"]的Session信息!");
                }
            }
        } else {
            System.out.println("无可清理用户信息~");
        }
    }

    @Override
    public boolean usernameOnly(String username){
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> list=userMapper.selectByExample(userExample);
        if(list!=null){
            return true;
        }
        return false;
    }

    @Override
    public List<User> selectUserByMail(String mail) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andMailEqualTo(mail);
        List<User> list=userMapper.selectByExample(userExample);
        return list;
    }

    @Override
    public boolean mailOnly(String mail) {
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andMailEqualTo(mail);
        List<User> list=userMapper.selectByExample(userExample);
        if(list!=null){
            return true;
        }else
        {
            return false;
        }
    }

    public boolean updatePass(String newpassword,String mail){
        UserExample userExample=new UserExample();
        UserExample.Criteria criteria=userExample.createCriteria();
        criteria.andMailEqualTo(mail);
        User user=new User();
        String salt=new SecureRandomNumberGenerator().nextBytes().toHex();
        String result=new Md5Hash(newpassword,salt,3).toString();
        user.setPassword(result);
        user.setSalt(salt);
        if(userMapper.updateByExampleSelective(user,userExample)>0)
        {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean updateUser(User newUser, String oldUSername) {
      UserExample userExample=new UserExample();
      UserExample.Criteria criteria=userExample.createCriteria();
      criteria.andUsernameEqualTo(oldUSername);
      if(userMapper.updateByExampleSelective(newUser,userExample)>0){
          return true;
      }else{
          return false;
      }
    }
}
