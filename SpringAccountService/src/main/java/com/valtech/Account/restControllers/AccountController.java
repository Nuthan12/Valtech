package com.valtech.Account.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.Account.entity.Account;
import com.valtech.Account.service.AccountService;

@RestController()
public class AccountController {
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/api/accounts/SB/")
	public Account createSavingsAccount(@RequestParam("balance") double balance) {
		return accountService.createSavingAccount(balance);
		
	}
	@PostMapping("/api/accounts/CA/")
	public Account createCurrentAccount(@RequestParam("balance") double balance) {
		return accountService.createCurrentAccount(balance);
		
	}

}
