package com.valtech.Account.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.valtech.Account.entity.Account;
import com.valtech.Account.repo.AccountRepository;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	

	private Account account;
	
	@Override
	public Account createAccount(Account account) {
		return accountRepository.save(account);
	}
	@Override
	public Account updateAccount(Account account) {
		return accountRepository.save(account);
	}
	
	@Override
	public Account getAccount(long id){
		  return accountRepository.findById(id).get();
	  }
	
	 @Override
	public List<Account> getAllAccounts(){
	 	  return accountRepository.findAll();
	   }
	@Override
	public Account createSavingAccount(double balance) {
		account=new Account("SB",balance);
		//return accountRepository.save();
		return accountRepository.save(account);
	}
	@Override
	public Account createCurrentAccount(double balance) {
		account=new Account("CA",balance);
		return accountRepository.save(account);
	}
}
