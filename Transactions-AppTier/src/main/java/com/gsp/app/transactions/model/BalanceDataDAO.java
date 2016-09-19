package com.gsp.app.transactions.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BalanceDataDAO extends CrudRepository<BalanceInfo, Long>{
	
	public List<BalanceInfo> findByActno(String actno);
}


