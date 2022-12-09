package com.valtech.cart.service;

import com.valtech.cart.entity.Cart;

public interface CartService {

	Cart createCart();

	Cart getCartById(long cartId);

	void checkOutCart(long cartId);

}