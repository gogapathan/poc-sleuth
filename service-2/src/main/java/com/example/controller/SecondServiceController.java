package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondServiceController {
	
	private static final Logger logger = LoggerFactory.getLogger(SecondServiceController.class);
	
	
	@GetMapping(value = "/secondservice")
	public String secondService()
	{
		logger.info(" logger from second service controller  ");
		return "hello from second service";
	}

}
