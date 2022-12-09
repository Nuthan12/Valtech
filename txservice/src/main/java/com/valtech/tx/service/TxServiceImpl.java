package com.valtech.tx.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.tx.entity.Tx;
import com.valtech.tx.repo.TransactionRepository;
@Service
public class TxServiceImpl implements TxService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	private Tx tx;
	
	
	@Override
	public Tx createTx(Tx tx){
		return transactionRepository.save(tx);
	}
	
	@Override
	public Tx getTx(long id){
		return transactionRepository.findById(id).get();
	}
	
	@Override
	public List<Tx> getAllTx(){
		return transactionRepository.findAll();
	}
	
	
	public Tx newTx(float amount, boolean debit, long accountId){
        Tx tx1 = new Tx(amount, debit, accountId);
        tx1.setAmount(amount);
        tx1.setTxTime(LocalDateTime.now());
        tx1.setAccountId(accountId);
        tx1.setDebit(debit);
        System.out.println("set values");
        return tx1;
    }
	
	public Tx newDebitTx(float amount, long accountId) {
        Tx tx1 = new Tx(amount, true, accountId);
        return tx1;
    }
	
	public Tx newCreditTx(float amount, long accountId) {
        // TODO Auto-generated method stub
        Tx tx1 = new Tx(amount, false, accountId);
        return tx1;
    }
	
	
	
	
}
