package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.entity.Product;

public interface CarService {


	Product update(Product car);

	Product get(int id);

	List<Product> getAllCars();

	Product createCar(Product car);

}