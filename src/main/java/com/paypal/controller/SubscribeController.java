package com.paypal.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.paypal.service.ISubscribeService;

@CrossOrigin
@RestController
@RequestMapping(value = "/subscribe")
public class SubscribeController {
	private static final Logger logger = LoggerFactory.getLogger(SubscribeController.class);
	
	@Autowired
	private ISubscribeService subscribeService;
			
	@RequestMapping(value = "/pricing", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Double> list(@RequestParam(name="customerId", required=true) String customerId) {
		logger.info("Get all Invoices");
		Double amount = subscribeService.pricing(customerId);
		
		if(amount != null) {
			return new ResponseEntity<Double>(amount, HttpStatus.OK);
		}else {
			return new ResponseEntity<Double>(HttpStatus.NOT_FOUND);
		}
	}
		
}

