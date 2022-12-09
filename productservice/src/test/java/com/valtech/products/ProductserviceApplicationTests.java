package com.valtech.products;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.products.entity.Product;
import com.valtech.products.service.ProductService;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@SpringBootTest
class ProductserviceApplicationTests {
	
	@Autowired
	private ProductService productService;
	
	
	@Test
	void contextLoads() {
		List<Product> products=productService.getAllProducts();
		if(products.size()==0){
			productService.saveProduct(new Product("Lays", 20, 25,120,5));
			productService.saveProduct(new Product("Kurkure", 30, 40,140,10));
			productService.saveProduct(new Product("Bingo", 10, 80,150,10));
		}
//		for(Product p:products){
//			productService.deleteProduct(p);
//		}
		assertEquals(3,productService.getAllProducts().size());
		
		
	}

}
