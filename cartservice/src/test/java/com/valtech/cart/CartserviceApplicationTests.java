package com.valtech.cart;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.valtech.cart.entity.Cart;
import com.valtech.cart.facade.ProductFacade;
import com.valtech.cart.service.CartService;
import com.valtech.cart.vo.ProductVO;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class CartserviceApplicationTests {
	
	
	@Autowired
	private CartService cartService;
	
	@Autowired
	private ProductFacade productFacade;
	
	 @Test
	    void completeFlow() {
	        List<ProductVO> prods = productFacade.getAllProducts();
	        Cart cart = cartService.createCart();
	        assertTrue(cart.getId() > 0);
	        cart = cartService.getCart(cart.getId());
	        cart=cartService.addLineItems(cart.getId(), prods.get(0).getId(), 3);//10 rs per item and 5% tax , so tax is 50ps.
	        assertEquals(3, cart.getTotalItems());
	        assertEquals(60, cart.getTotal());
	        assertEquals(72.0f, cart.getTaxesTotal());
	        assertEquals(132.0f, cart.getGrandTotal());
	        cart=cartService.addLineItems(cart.getId(), prods.get(1).getId(), 5);//15 rs per item and 5% tax , so tax is 0.75 rs.
	        assertEquals(8, cart.getTotalItems());
	        assertEquals(210, cart.getTotal());
	        assertEquals(282.0f , cart.getTaxesTotal());
	        assertEquals(492.0f, cart.getGrandTotal());
	        cartService.checkOut(cart.getId());
	    }



}
