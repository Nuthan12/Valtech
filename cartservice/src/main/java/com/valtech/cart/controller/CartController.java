package com.valtech.cart.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.cart.entity.Cart;
import com.valtech.cart.service.CartService;
import com.valtech.cart.service.CartServiceImpl;

@RestController
@RequestMapping("/api/carts")
public class CartController {
	
	private static final Logger logger=LoggerFactory.getLogger(CartController.class);
	
	@Autowired
	private CartService cartService;
	
	@PostMapping("/")
	public Cart createCart(){
		return cartService.createCart();
	}
	
	@GetMapping("/{id}")
	public Cart getCart(@PathVariable("id") long id){
		return cartService.getCart(id);
	}
	
	@PostMapping("/{id}/{prodId}/{quantity}")
	public Cart addProductToCart(@PathVariable("id") long cartId,@PathVariable("prodId") long prodId,@PathVariable("quantity") int quantity){
		return cartService.addLineItems(cartId, prodId, quantity);
	}
	
	@PostMapping("/checkout/{id}")
	public Cart checkOut(@PathVariable("id") long id){
		return cartService.checkOut(id);
	}
	
	
	
}
