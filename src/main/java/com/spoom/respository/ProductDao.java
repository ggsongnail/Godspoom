package com.spoom.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spoom.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
}
