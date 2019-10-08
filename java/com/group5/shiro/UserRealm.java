package com.group5.shiro;

import com.group5.entity.User;
import com.group5.service.impl.AuthorityServiceImpl;
import com.group5.service.impl.UserServiceImpl;
import org.apache.shiro.authc.*;
import org.apache.shiro.authc.credential.CredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm {

@Autowired
private UserServiceImpl userService;
@Autowired
private AuthorityServiceImpl authorityService;

    //授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

    String principal=(String)principalCollection.getPrimaryPrincipal();

    List<String> permissions=authorityService.AuthorityList(principal);
        SimpleAuthorizationInfo simpleAuthorizationInfo=new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addStringPermissions(permissions);
        return simpleAuthorizationInfo;
    }

    //认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        UsernamePasswordToken userToken= (UsernamePasswordToken) token;
        String userCode=userToken.getUsername();
        User user=null;
        user=userService.findByUserName(userCode);
        if(user==null){
            throw new UnknownAccountException("账户"+userCode+"不存在！");
        }

            //4.2 如果查询到了，封装查询结果，
            Object principal = user.getUsername();
            Object credentials = user.getPassword();
            String realmName = this.getName();
            System.out.println(this.getName());
            ByteSource salt=ByteSource.Util.bytes(user.getSalt());

            SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(principal,credentials,salt,realmName);
            return info;
    }
}
