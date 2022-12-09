package com.valtech.Tx.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.valtech.Tx.Service.TxService;
import com.valtech.Tx.entities.Tx;

@RestController
public class TxRestController {
 
	@Autowired
    private TxService txService;
     @PostMapping("/api/tx/")
    public Tx createTx(@RequestBody Tx tx) {
        return txService.createTx(tx);
    }

   @GetMapping("/api/tx/{id}")
    public Tx getTxById(@PathVariable("id")Long id) {
        return txService.getTx(id);
    }

   @GetMapping("/api/tx/")
    public List<Tx> getTxByAll() {
        return txService.getAllTxs();
    }
    
    
}