package com.valtech.Account.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.Account.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
