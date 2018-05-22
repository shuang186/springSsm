package com.service.impl;

import com.dao.UserMapper;
import com.model.User;
import com.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class IUserServiceImpl implements IUserService {
	
	@Resource
	private UserMapper userMapper;
	public User getUserById(String userId) {
		return this.userMapper.getUserById(userId);
	}
	
	public List<User> getAllUsers() {
		return this.userMapper.getAllUser();
	}
}
