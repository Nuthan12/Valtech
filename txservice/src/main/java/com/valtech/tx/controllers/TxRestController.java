package com.valtech.tx.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.tx.entity.Tx;
import com.valtech.tx.service.TxService;

@RestController
public class TxRestController {

	 @Autowired
	    private TxService txService;
	    
	    @PostMapping("/api/tx/new")
	    public Tx createNewTx(@RequestParam("amount") float amount, @RequestParam("debit") boolean debit, @RequestParam("accountId") long accountId){
	        return txService.newCreditTx(amount, accountId);
	    }
	    
	    @PostMapping("/api/tx/debit")
	    public Tx newDebitTx(@RequestParam("amount") float amount, @RequestParam("accountId") long accountId){
	        return txService.newDebitTx(amount, accountId);
	    }
	    
	    @PostMapping("/api/tx/credit")
	    public Tx newCreditTx(@RequestParam("amount") float amount, @RequestParam("accountId") long accountId){
	        return txService.newCreditTx(amount, accountId);
	    }
	    
	    @GetMapping("/api/tx/{id}")
	    public Tx getTx(long id){
	    	return txService.getTx(id);
	    }
	    
	    @GetMapping("/api/tx")
	    public List<Tx> getAllTxs(){
	    	return txService.getAllTx();
	    }
	
	
	
	
	
	
	
}
