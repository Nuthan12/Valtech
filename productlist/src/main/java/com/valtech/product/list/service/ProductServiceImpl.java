package com.valtech.product.list.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.product.list.entity.Product;
import com.valtech.product.list.repo.ProductRepo;



@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepo productRepo;
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Product createProduct(Product product){
		return productRepo.save(product);
	}
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Product updateProduct(Product product){
		return productRepo.save(product);
	}
	
	@Override
	public Product get(int id){
		return productRepo.getReferenceById(id);
	}
	
	@Override
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}


	@Override
	public void delete(int id) {
	
	 productRepo.deleteById(id);
	}
	
}
