package com.spoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spoom.entity.Killed;
import com.spoom.respository.KilledDao;

@Service
@Transactional
public class KilledService {
	@Autowired
	private KilledDao killedDao;

	public List<Killed> findAll() {
		return killedDao.findAll();
	}
	
	public Killed findById(int id){
		return killedDao.findOne(id);
	}
	
	public void save(Killed killed){
		killedDao.save(killed);
	}
	
	public void delete(int id){
		killedDao.delete(id);
	}
}
