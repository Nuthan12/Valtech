package com.valtech.cart.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.cart.facade.ProductFacade;
import com.valtech.cart.vo.ProductVO;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductFacadeTest {
	
	@Autowired
	private ProductFacade productFacade;
	
	@Test
	public void testProducts(){
		List<ProductVO> products =productFacade.getAllProducts();
		assertEquals(3, products.size());
	}
}
