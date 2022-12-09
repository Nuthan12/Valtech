package com.valtech.cart.facade;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.valtech.cart.vo.ProductVO;

@Component
//Facade is fundamentally used for hiding he complexity of calling a service 
public class ProductFacade {
	
	@Autowired
	private RestTemplate restTemplate;
	private static final String PRODUCTS_URL="http://PRODUCTSERVICE/api/products";
	
	
	public ProductVO getProduct(long id){
		return restTemplate.getForObject(PRODUCTS_URL+"/"+id, ProductVO.class);
	}
	//Not Necessary
	public ProductVO saveProduct(ProductVO product){
		return restTemplate.postForObject(PRODUCTS_URL+"/", product, ProductVO.class);
	}

	public ProductVO updateProduct(ProductVO product){
		 restTemplate.put(PRODUCTS_URL+"/"+product.getId(), product, ProductVO.class);
		 return getProduct(product.getId());
	}

	public ProductVO addQuantity(long prodId, int quantity){
		Map<String,String> params=new HashMap<>();
		params.put("quantity", ""+quantity);
		return restTemplate.postForObject(PRODUCTS_URL+"/addQuantity"+prodId, null, ProductVO.class);
		
	}
	
	public ProductVO subQuantity(long prodId, int quantity){
		Map<String,String> params=new HashMap<>();
		params.put("quantity", ""+quantity);
		return restTemplate.postForObject(PRODUCTS_URL+"/subQuantity"+prodId, null, ProductVO.class);
	}

	public void deleteProduct(ProductVO product){
		restTemplate.delete(PRODUCTS_URL+"/"+product.getId());
	}

	public List<ProductVO> getAllProducts(){
		return Arrays.asList(restTemplate.getForObject(PRODUCTS_URL+"/", ProductVO[].class));
	}

	
}
