package com.spoom.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spoom.entity.Killed;

public interface KilledDao extends JpaRepository<Killed, Integer>{
	
}
