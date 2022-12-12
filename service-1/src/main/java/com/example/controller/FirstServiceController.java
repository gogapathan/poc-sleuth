package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.poc.FeignClientUtil;


@RestController
public class FirstServiceController {
	
	private static final Logger logger = LoggerFactory.getLogger(FirstServiceController.class);
	
	@Autowired
	private FeignClientUtil feignClientUtil;
	
	
	@GetMapping(value = "/firstservice")
	public String firstService(@CookieValue(name = "sampleCookie") String sampleCookie)
	{
		logger.info(" logger from first service controller, logging cookie " + sampleCookie);
		
		return feignClientUtil.secondService();
	}

}
