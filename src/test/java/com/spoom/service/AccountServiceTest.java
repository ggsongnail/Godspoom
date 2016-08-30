package com.spoom.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccountServiceTest {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("spring-jpa.xml");
	private static AccountService accountService = (AccountService) context.getBean("accountService");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(accountService.findAll().size());
	}

}
