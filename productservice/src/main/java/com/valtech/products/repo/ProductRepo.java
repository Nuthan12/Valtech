package com.valtech.products.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.products.entity.Product;


@Repository
public interface ProductRepo extends JpaRepository<Product,Long> {

}
