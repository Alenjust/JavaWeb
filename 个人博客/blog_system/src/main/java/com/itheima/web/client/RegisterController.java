package com.itheima.web.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itheima.model.domain.User;
import com.itheima.service.UserService;

@Controller
public class RegisterController {
	
	@Autowired
	UserService Service;
	/**
     * 注册界面
     * @return
     */
    
    @RequestMapping("/toregister")
	public String addUser() {
		return "comm/register";
	}
    
    @RequestMapping("/register")
    @ResponseBody
    public String register(User user){
    	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    	user.setUserpassword(passwordEncoder.encode(user.getUserpassword()));
    	Service.insert(user);
        return "注册成功！";
    }
}
