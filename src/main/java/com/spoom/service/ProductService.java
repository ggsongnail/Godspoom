package com.spoom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spoom.entity.Product;
import com.spoom.respository.ProductDao;

@Service
public class ProductService {
	@Autowired
	private ProductDao productDao;

	public List<Product> findAll() {
		return productDao.findAll();
	}
}
