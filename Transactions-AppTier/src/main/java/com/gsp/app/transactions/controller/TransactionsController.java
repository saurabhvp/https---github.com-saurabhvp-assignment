package com.gsp.app.transactions.controller;

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

import com.gsp.app.transactions.model.Transactions;
import com.gsp.app.transactions.model.TransactionsDAO;


@Controller
@RestController
@RequestMapping("/transactions/get-by-actno")
public class TransactionsController {

private Logger logger = LogManager.getLogger(this.getClass());
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(method = RequestMethod.GET, params = {"actno"})
	@ResponseBody
	public ResponseEntity<List<Transactions>>  getByActno(String actno) {
		
		List<Transactions> transactions = new ArrayList<Transactions>();
	    try {
	    	logger.info("inside get-by-actno");
	    	transactions = transactionsDao.findByActno(actno);
	    	 logger.info("The transactions is: " + transactions.toString());
	    	 return new ResponseEntity<List<Transactions>>(transactions,HttpStatus.OK);
	    }
	    catch (Exception ex) {
	    	logger.info("exception occured");
	    	ex.printStackTrace();
	        return new ResponseEntity<List<Transactions>>(HttpStatus.NOT_FOUND);
	    }
		
	    
	}
	
	// ------------------------
	  // PRIVATE FIELDS
	  // ------------------------

	  @Autowired
	  private TransactionsDAO transactionsDao;
}
