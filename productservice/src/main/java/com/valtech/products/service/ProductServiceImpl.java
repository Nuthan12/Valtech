package com.valtech.products.service;



import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.products.entity.Product;
import com.valtech.products.repo.ProductRepo;

@Service
@Transactional(propagation=Propagation.REQUIRED)
public class ProductServiceImpl implements ProductService {
	
	private static final Logger logger=LoggerFactory.getLogger(ProductServiceImpl.class);
	
	
	@Autowired
	private ProductRepo productRepo;
	
	@Override
	public Product getProduct(long id){
		logger.info("Fetching Product with id "+id);
		
		Product p= productRepo.findById(id).get();
		logger.debug("Product with id= "+id+" is "+id);
		return p;
	}
	
	@Override
	public Product saveProduct(Product product){
		logger.info("Saving New Product");
		Product p= productRepo.save(product);
		logger.debug("Product Saved with id = "+p.getId()+" is "+p);
		return p;
	}
	
	@Override
	public Product updateProduct(Product product){
		logger.info("Fetching Product with id "+product.getId());
		Product p= productRepo.save(product);
		logger.debug("Product Updated with id "+ product.getId()+" is "+p );
		return p;
	}
	
	@Override
	public Product addQuantity(long id,int quantity){
		logger.debug("Add Quantity for Product id = "+id+" Quantity Added = "+quantity);
		Product product=getProduct(id);
		logger.debug("Before Adding Quantity" +product);
		product.setQuantity(product.getQuantity()+quantity);
		logger.debug("After Adding Quantity "+product);
		return updateProduct(product);
	
	}
	
	@Override
	public void deleteProduct(Product product){
		logger.info("Deleting product with id "+product.getId());
		 productRepo.delete(product);
	}
	
	@Override
	public List<Product> getAllProducts(){
		logger.info("Loading All Products");
		List<Product> prods=productRepo.findAll();
		logger.info("Loaded "+prods.size()+" products");
		logger.debug("Products are "+prods);
		return productRepo.findAll();
	}

	@Override
	public Product subQuantity(long id, int quantity) {
		logger.debug("Subtract Quantity for Product id = "+id+" Quantity Added = "+quantity);
		Product product=getProduct(id);
		logger.debug("Before Subtracting Quantity" +product);
		product.setQuantity(product.getQuantity()-quantity);
		logger.debug("After Subtracting Quantity "+product);
		return updateProduct(product);
	}
	
}
