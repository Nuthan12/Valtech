package com.valtech.cart.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.cart.entity.LineItem;


@Repository
public interface LineItemRepo extends JpaRepository<LineItem, Long> {

}
