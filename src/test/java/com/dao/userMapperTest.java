package com.dao;

import com.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations ={"classpath:spring-mybatis.xml"})
public class userMapperTest {
//	private static Logger logger = Logger.getLogger(TestMyBatis.class);
	@Resource
	private  UserMapper userMapper;

	
	@Test
	public void getAllUser(){
		
		List<User>userList=userMapper.getAllUser();
		System.out.print("ccc"+userList.toString());
	
	}
	
}
