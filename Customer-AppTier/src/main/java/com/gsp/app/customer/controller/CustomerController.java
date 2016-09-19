package com.gsp.app.customer.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.gsp.app.customer.model.Customer;
import com.gsp.app.customer.model.CustomerDAO;;

@Controller
@RestController
@RequestMapping("/customer/get-by-actno")
public class CustomerController {

	private Logger logger = LogManager.getLogger(this.getClass());
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(method = RequestMethod.GET, params = {"actno"})
	@ResponseBody
	public ResponseEntity<List<Customer>>  getByActno(String actno) {
		
		List<Customer> customer = new ArrayList<Customer>();
	    try {
	    	logger.info("inside get-by-actno");
	    	 customer = customerDao.findByActno(actno);
	    	 logger.info("The customer is: " + customer.toString());
	    	 return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
	    }
	    catch (Exception ex) {
	    	logger.info("exception occured");
	    	ex.printStackTrace();
	        return new ResponseEntity<List<Customer>>(HttpStatus.NOT_FOUND);
	    }
		
	    
	}
	
	// ------------------------
	  // PRIVATE FIELDS
	  // ------------------------

	  @Autowired
	  private CustomerDAO customerDao;
}
