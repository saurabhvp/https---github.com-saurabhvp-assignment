package com.gsp.app.portal.controller;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	private Logger logger = LogManager.getLogger(this.getClass());
	
	@CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
		logger.info("Inside Portal");
		return "index";
    }
}
