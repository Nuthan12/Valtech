package com.valtech.tx.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valtech.tx.entity.Tx;

public interface TransactionRepository extends JpaRepository<Tx, Long>{
	
	
	
	
}
