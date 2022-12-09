package com.valtech.Tx.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.Tx.entities.Tx;

@Repository
public interface TxRepository extends JpaRepository<Tx, Long> {

}
