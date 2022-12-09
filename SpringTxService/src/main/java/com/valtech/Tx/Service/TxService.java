package com.valtech.Tx.Service;

import java.util.List;

import com.valtech.Tx.entities.Tx;

public interface TxService {

	Tx createTx(Tx tx);

	Tx getTx(Long id);

	List<Tx> getAllTxs();

}