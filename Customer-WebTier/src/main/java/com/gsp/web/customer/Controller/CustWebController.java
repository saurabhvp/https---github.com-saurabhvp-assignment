package com.gsp.web.customer.Controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class CustWebController {
	 
	private Logger logger = LogManager.getLogger(this.getClass());
	@CrossOrigin(origins = "*", maxAge = 3600)
	@RequestMapping(value="/custdetails", method = RequestMethod.GET, params = {"actno"})
	public String homepage(Model model,String actno,HttpServletResponse response){
		
		try{
			model.addAttribute("actno",actno );
			logger.info("actno:"+actno);
			return "customertemplate";
		}
	    catch (Exception ex) {
	    	logger.info("exception occured");
	    	ex.printStackTrace();
	        return "customertemplate";
	    }
	}
}
