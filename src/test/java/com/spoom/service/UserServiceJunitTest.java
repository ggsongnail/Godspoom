package com.spoom.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.spoom.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jpa.xml")
public class UserServiceJunitTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void testFindAll(){
		System.out.println(userService.findAll().size());
	}
	
	
	public void testSave(){
		User user = userService.findById(2);
		user.setName("Jony");
		userService.save(user);
	}
	
	
	public void testInsert(){
		User user = new User();
		user.setName("Jony");
		user.setPhone("13414985655");
		userService.save(user);
	}
	
	public void testTransactionRollBack(){
		userService.testTransactionRollBack(1);
	}
}
