package com.spoom.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spoom.entity.Account;

public interface AccountDao extends JpaRepository<Account, Long>{
	
}
