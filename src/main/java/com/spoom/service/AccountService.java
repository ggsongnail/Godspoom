package com.spoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.spoom.entity.Account;
import com.spoom.respository.AccountDao;
@Component
public class AccountService {
	@Autowired
	private AccountDao accountDao;

	public List<Account> findAll(){
		return accountDao.findAll();
	}
	
}
