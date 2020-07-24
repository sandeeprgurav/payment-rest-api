package com.paypal.controller;

import java.util.Date;
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

import com.paypal.entity.Billing;
import com.paypal.service.IBillingService;

@CrossOrigin
@RestController
@RequestMapping(value = "/billing")
public class BillingController {
	private static final Logger logger = LoggerFactory.getLogger(BillingController.class);

	@Autowired
	private IBillingService billingService;

	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<List<Billing>> list(@RequestParam(name = "processDate", required = true) String processDate) {
		logger.info("Get all Billings");
		List<Billing> billings = billingService.findBillings(processDate);

		if (billings != null) {
			return new ResponseEntity<List<Billing>>(billings, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<Billing>>(HttpStatus.NOT_FOUND);
		}
	}

}
