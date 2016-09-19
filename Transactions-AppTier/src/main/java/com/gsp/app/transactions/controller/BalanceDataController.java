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

import com.gsp.app.transactions.model.BalanceInfo;
import com.gsp.app.transactions.model.BalanceDataDAO;


@Controller
@RestController
@RequestMapping("/transactions/balancedata/get-by-actno")
public class BalanceDataController {

private Logger logger = LogManager.getLogger(this.getClass());
	
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(method = RequestMethod.GET, params = {"actno"})
	@ResponseBody
	public ResponseEntity<List<BalanceInfo>>  getByActno(String actno) {
		
		List<BalanceInfo> balanceInfo = new ArrayList<BalanceInfo>();
	    try {
	    	logger.info("inside BalanceInfo >> get-by-actno");
	    	balanceInfo = balanceDataDao.findByActno(actno);
	    	 logger.info("The balanceData is: " + balanceInfo.toString());
	    	 return new ResponseEntity<List<BalanceInfo>>(balanceInfo,HttpStatus.OK);
	    }
	    catch (Exception ex) {
	    	logger.info("exception occured");
	    	ex.printStackTrace();
	        return new ResponseEntity<List<BalanceInfo>>(HttpStatus.NOT_FOUND);
	    }
		
	    
	}
	
	// ------------------------
	  // PRIVATE FIELDS
	  // ------------------------

	  @Autowired
	  private BalanceDataDAO balanceDataDao;
}
