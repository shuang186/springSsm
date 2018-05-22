package com.dao;

import com.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
	
	int addUser(User user);
	
	int deleteUserById(String id);
	
	int updateUserById(int id);
	
	List<User> getAllUser();
	
	User getUserById(String id );
	
	User selectUserById(String id);
	
	
	
}