package com.valtech.cart.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.cart.entity.Cart;
import com.valtech.cart.repo.CartRepository;

@Service
public class CartServiceImplementation implements CartService {
	
	@Autowired
	private CartRepository cartRepository;
	
	
	public Cart createCart(){
		Cart cart=cartRepository.save(new Cart());
		return cart;

	}
	
	public Cart getCartById(long cartId){
		Cart cart=cartRepository.findById(cartId).get();
		return cart;
	}
	
	public void checkOutCart(long cartId){
		Cart cart=cartRepository.findById(cartId).get();
		cart.setCheckedOut(true);
		cartRepository.delete(cart);
		
	}
	
//	public Cart reduceQuantity(long cartId){
//		
//	}
//	

}
