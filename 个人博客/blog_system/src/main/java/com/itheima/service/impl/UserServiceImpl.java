package com.itheima.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itheima.dao.UserMapper;
import com.itheima.model.domain.User;
import com.itheima.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper mapper;

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		Integer rows = mapper.addnew(user);
		System.err.println("rows="+rows);
	}
}
