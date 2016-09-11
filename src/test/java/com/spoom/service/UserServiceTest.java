package com.spoom.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spoom.entity.Killed;
import com.spoom.entity.User;

public class UserServiceTest {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("spring-jpa.xml");
	private static KilledService killedService = (KilledService) context.getBean("killedService");
	private static UserService userService = (UserService) context.getBean("userService");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Killed> kills = killedService.findAll();
		List<User> users = userService.findAll();;
	}

}
