package com.itheima;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import com.itheima.dao.UserMapper;
import com.itheima.model.domain.User;
import com.itheima.service.UserService;

import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogSystemApplicationTests {

	@Autowired
	UserService Service;
    @Test
    public void addnew() {
    	  BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
    	  String passwordString = "123456";
    	User user = new User();
    	user.setUsername("sss");
    	user.setUserpassword("123456");
    	user.setEmail("545564@qq.com");
    	String encodedPassword = bcryptPasswordEncoder.encode(passwordString);
    	Service.insert(user);
    	System.err.println(encodedPassword);
    }
    
}
