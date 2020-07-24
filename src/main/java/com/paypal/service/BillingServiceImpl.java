package com.paypal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.entity.Billing;
import com.paypal.repository.BillingRepository;
import com.paypal.utils.DateUtils;

@Service
public class BillingServiceImpl implements IBillingService {

	@Autowired
	BillingRepository billingRepository;

	@Override
	public List<Billing> findBillings(String processDate) {		
		try {			
			return billingRepository.findByCreatedDate(DateUtils.getStringToDate(processDate));			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	 
}
