package com.valtech.cart.service;

import com.valtech.cart.entity.Cart;

public interface CartService {

	Cart createCart();

	Cart getCart(long id);

	Cart checkOut(long cartId);

	Cart addLineItems(long cartId, long productId, int quantity);

}