package com.spoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoom.entity.Killed;
import com.spoom.respository.KilledDao;

@Service
public class KilledService {
	@Autowired
	private KilledDao killedDao;

	public List<Killed> findAll() {
		return killedDao.findAll();
	}
}
