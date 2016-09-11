package com.spoom.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spoom.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{
	
}
