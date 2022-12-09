package com.valtech.Tx.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.Tx.entities.Tx;
import com.valtech.Tx.repo.TxRepository;

@Service
public class TxServiceImpl implements TxService {

	@Autowired
	private TxRepository txRepository;
	
	@Override
	public Tx createTx(Tx tx) {
		return txRepository.save(tx);
	}
	
	@Override
	public Tx getTx(Long id) {
		return txRepository.findById(id).get();
	}
	
	@Override
	public List<Tx> getAllTxs(){
	 	  return txRepository.findAll();
	   }
	
	
}
