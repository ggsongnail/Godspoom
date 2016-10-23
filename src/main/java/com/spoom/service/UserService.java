package com.spoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spoom.entity.User;
import com.spoom.respository.UserDao;

@Service
@Transactional
public class UserService {
	@Autowired
	private UserDao userDao;

	public List<User> findAll() {
		List<User> users = userDao.findAll();
		System.out.println(users.get(0).getKilleds());
		return users;
	}
	
	public User findById(int id){
		return userDao.findOne(id);
	}
	
	public void save(User user){
		userDao.save(user);
	}
	
	public void testTransactionRollBack(int id){
		User user = userDao.findOne(id);
		user.setName("bobo");
		userDao.save(user);
		int i = 2/0;
	}
}
