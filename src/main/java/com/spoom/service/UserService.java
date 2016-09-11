package com.spoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spoom.entity.User;
import com.spoom.respository.UserDao;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;

	@Transactional
	public List<User> findAll() {
		List<User> users = userDao.findAll();
		System.out.println(users.get(0).getKilleds().get(0).getId());
		return users;
	}
}
