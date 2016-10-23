package com.spoom.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.spoom.entity.Killed;
import com.spoom.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-jpa.xml")
public class KilledServiceJunitTest {
	@Autowired
	private UserService userService;
	
	@Autowired
	private KilledService killedService;
	
	@Test
	public void testInsert(){
		Killed killed = new Killed();
		User user = userService.findById(1);
		//user.setName("apple");
		//User user = new User();
		killed.setUser(user);
		killedService.save(killed);
	}
	
	
	public void testDelete(){
		//Killed killed = killedService.findById(18);
		killedService.delete(18);
	}
	
}
