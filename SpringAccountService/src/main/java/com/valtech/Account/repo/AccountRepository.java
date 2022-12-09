package com.valtech.Account.repo;

import org.aspectj.util.LangUtil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.valtech.Account.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
	

}
