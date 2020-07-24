package com.paypal.controller;

import java.util.List;

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

import com.paypal.entity.Subscribe;
import com.paypal.service.ISubscribeService;

@CrossOrigin
@RestController
@RequestMapping(value = "/subsribe")
public class SubscribeController {
	private static final Logger logger = LoggerFactory.getLogger(SubscribeController.class);
	
	@Autowired
	private ISubscribeService subscribeService;
			
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Subscribe>> list(@RequestParam(name="processDate", required=true) String processDate) {
		logger.info("Get all Invoices");
		List<Subscribe> subscribes = subscribeService.findSubscribes(processDate);
		
		if(subscribes != null) {
			return new ResponseEntity<List<Subscribe>>(subscribes, HttpStatus.OK);
		}else {
			return new ResponseEntity<List<Subscribe>>(HttpStatus.NOT_FOUND);
		}
	}
		
}

