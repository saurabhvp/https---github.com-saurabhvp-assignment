package com.gsp.app.transactions.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import com.gsp.app.transactions.model.Transactions;

@Transactional
public interface TransactionsDAO extends CrudRepository<Transactions, Long>{
	
	public List<Transactions> findByActno(String actno);
}


