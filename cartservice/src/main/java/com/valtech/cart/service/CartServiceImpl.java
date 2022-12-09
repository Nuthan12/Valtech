package com.valtech.cart.service;

import javax.sound.sampled.Line;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraReactiveRepositoriesAutoConfiguration;
import org.springframework.stereotype.Service;

import com.valtech.cart.entity.Cart;
import com.valtech.cart.entity.LineItem;
import com.valtech.cart.facade.ProductFacade;
import com.valtech.cart.repo.CartRepo;
import com.valtech.cart.repo.LineItemRepo;
import com.valtech.cart.vo.ProductVO;

@Service
public class CartServiceImpl implements CartService  {
	
	private static final Logger logger=LoggerFactory.getLogger(CartServiceImpl.class);
	
	
	
	@Autowired
	private CartRepo cartRepo;
	@Autowired
	private LineItemRepo lineItemRepo;
	@Autowired
	private ProductFacade productFacade;
	
	
	@Override
	public Cart createCart(){
		logger.info("Creating a new cart");
		Cart cart=cartRepo.save(new Cart());
		logger.debug("Cart Successfully created "+cart);	
		return cart;
	}
	
	@Override
	public Cart getCart(long id){
		logger.info("Loading Cart with id = "+id);
		Cart cart=cartRepo.findById(id).get();
		logger.debug("Successfully loaded Cart "+cart);
		return cart;
	}
	
	
	
	@Override
	public Cart checkOut(long cartId){
		logger.info("Checking Out Cart with id = "+cartId);
		Cart cart =cartRepo.findById(cartId).get();
		cart.setCheckedOut(true);
		lineItemRepo.deleteById(cartId);
		//update allItem Quantity in the productService
		cart= cartRepo.save(cart);
		logger.debug("Checking Out Cart with id = "+cartId);
		return cart;
	}
	
	@Override
	public Cart addLineItems(long cartId,long productId,int quantity){
		logger.info("Loading Cart wiht id = "+cartId);
		Cart cart =cartRepo.findById(cartId).get();
		logger.info("Loading Product with id = "+productId);
		ProductVO prod=productFacade.getProduct(productId);
		logger.debug("Loaded Product + "+prod);
		
		/*Get the product
		 check quantity available
		 create a line item
		 add line item to cart
		 save the cart
		
		 */
		logger.debug("Before Adding Item to the Cart "+cart);
		LineItem item=lineItemRepo.save(new LineItem(productId,quantity,prod.getCost()*quantity,prod.getTax()*quantity));
		
		cart.addLineItem(item);
		cart= cartRepo.save(cart);
		logger.debug("After Adding Item to the Cart "+cart);
		return cart;
	}
	
	
}
