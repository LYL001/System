package com.group5.service.impl;

        import com.group5.dao.UserMapper;
        import com.group5.entity.Choice;
        import com.group5.entity.User;
        import com.group5.entity.UserExample;
        import com.group5.entity.Userinfo;
        import com.group5.service.UserService;
        import org.apache.shiro.crypto.SecureRandomNumberGenerator;
        import org.apache.shiro.crypto.hash.Md5Hash;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import sun.security.provider.MD5;

        import javax.servlet.http.HttpSession;
        import java.util.ArrayList;
        import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


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
}
