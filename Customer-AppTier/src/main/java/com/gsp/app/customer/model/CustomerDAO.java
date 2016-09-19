package com.gsp.app.customer.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface CustomerDAO extends CrudRepository<Customer, Long>{
	
	public List<Customer> findByActno(String actno);
}
