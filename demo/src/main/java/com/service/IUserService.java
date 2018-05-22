package com.service;

import com.model.User;

import java.util.List;

public interface IUserService {
	
	public User getUserById(String userId);
	
	public List<User>getAllUsers();
	
}
