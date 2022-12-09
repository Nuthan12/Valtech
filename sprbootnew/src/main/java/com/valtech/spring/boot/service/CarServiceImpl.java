package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.valtech.spring.boot.entity.Product;
import com.valtech.spring.boot.repo.CarRepository;

@Service
@Transactional(propagation=Propagation.SUPPORTS)
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Product createCar(Product car){
		return carRepository.save(car);
	}
	
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)
	public Product update(Product car){
		return carRepository.save(car);
	}
	
	@Override
	public Product get(int id){
		return carRepository.getReferenceById(id);
	}
	
	@Override
	public List<Product> getAllCars(){
		return carRepository.findAll();
	}
	
}
