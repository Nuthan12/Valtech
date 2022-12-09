package com.valtech.Account.service;

import java.util.List;

import com.valtech.Account.entity.Account;

public interface AccountService {

	Account createAccount(Account account);

	Account updateAccount(Account account);

	Account getAccount(long id);

	List<Account> getAllAccounts();

	Account createSavingAccount(double balance);

	Account createCurrentAccount(double balance);


}