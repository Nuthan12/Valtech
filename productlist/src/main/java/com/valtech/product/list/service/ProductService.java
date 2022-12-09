package com.valtech.product.list.service;

import java.util.List;

import com.valtech.product.list.entity.Product;

public interface ProductService {
	
	
	Product updateProduct(Product product);

	Product get(int id);
	
	void delete(int id);

	List<Product> getAllProducts();

	Product createProduct(Product product);

	
}