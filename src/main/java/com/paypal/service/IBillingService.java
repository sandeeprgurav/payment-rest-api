package com.paypal.service;

import java.util.List;

import com.paypal.entity.Billing;

public interface IBillingService {

	List<Billing> findBillings(String  processDate);
	
}
