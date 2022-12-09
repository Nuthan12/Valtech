package com.valtech.product.list.restcontollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.product.list.service.ProductService;
import com.valtech.product.list.entity.Product;

@RestController
public class ProductRestController {
	
	
	@Autowired
	private ProductService productService;
	
	@PutMapping("/api/products/{id}")
	public Product updateProduct(@PathVariable("id") int id,@RequestBody Product product ){
		return productService.updateProduct(product);
	}
	
	
	@PostMapping("/api/products")
	public Product createProduct(@RequestBody Product product){
		return productService.createProduct(product);
		
	}
	
	@GetMapping("/api/products/{id}")
	public Product getProduct(@PathVariable("id") int id){
		return productService.get(id);
	}
	
	@GetMapping("/api/products")
	public List<Product> getProducts(){
		return productService.getAllProducts();
	
}
}
