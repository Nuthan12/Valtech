package com.valtech.products.service;

import java.util.List;

import com.valtech.products.entity.Product;

public interface ProductService {

	Product getProduct(long id);

	Product saveProduct(Product product);

	Product updateProduct(Product product);

	Product addQuantity(long id, int quantity);

	void deleteProduct(Product product);

	List<Product> getAllProducts();

	Product subQuantity(long id, int quantity);

}