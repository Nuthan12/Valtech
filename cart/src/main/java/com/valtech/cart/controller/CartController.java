package com.valtech.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.valtech.cart.entity.Cart;
import com.valtech.cart.service.CartService;

@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	@GetMapping("/carts/list")
	public String getAllCarts(Model model){
		return "carts/list";
	}
	
	@PostMapping("/")
	public Cart createCart(){
		return cartService.createCart();
	}
	
	@GetMapping("/{cartId}")
	public Cart getCart(@PathVariable("cartId") long cartId){
		
		return cartService.getCartById(cartId);
	}
	
	
	
	@PostMapping("/checkout/{cartId}")
	public void checkOut(@PathVariable("id") long cartId){
		 cartService.checkOutCart(cartId);
	}
	
	
	
	
}
