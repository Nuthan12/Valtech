package com.valtech.product.list.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.product.list.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
	
	
	List<Product> findById(int id);
	List<Product> findByName(String name);
	List<Product> findByPrice(float price);
	
}
