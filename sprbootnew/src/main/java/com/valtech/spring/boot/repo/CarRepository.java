package com.valtech.spring.boot.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.spring.boot.entity.Product;

@Repository
public interface CarRepository extends JpaRepository<Product, Integer> {
	
	List<Product> findByColor(String color);
	List<Product> findByPriceLessThan(float minPrice);
	List<Product> findByColorAndPriceLessThan(String color,float minPrice);
}
