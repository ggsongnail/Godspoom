package com.spoom.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jpa.xml")
public class UserServiceJunitTest {
	@Autowired
	private UserService userService;
	
	@Test
	public void testFindAll(){
		System.out.println(userService.findAll().size());
	}
}
