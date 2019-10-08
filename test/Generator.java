import com.group5.dao.AuthorityMapper;
import com.group5.dao.ChinaMapper;
import com.group5.dao.UserinfoMapper;
import com.group5.entity.Authority;
import com.group5.entity.China;
import com.group5.entity.Userinfo;
import com.group5.util.Config;
import com.group5.util.CreateSalt;
import com.group5.util.HttpUtil;
import org.apache.commons.httpclient.UsernamePasswordCredentials;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:/applicationContext.xml"})
public class Generator {

    @Autowired
    private AuthorityMapper authorityMapper;
    @Autowired
    private UserinfoMapper userinfoMapper;

    static int code;
    @Test
    public void aa(){
        code=11111;
    }

    @Test
    public void login()  {
        //List <String> list=authorityMapper.selectByUsername("tt");
       // Userinfo userinfo=userinfoMapper.selectByUsername("11");
    /*for(String authority:list){
        System.out.println(authority);
    }*/
        System.out.println(this.code);

    }
}