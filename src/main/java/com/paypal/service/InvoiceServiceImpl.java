package com.paypal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paypal.entity.Invoice;
import com.paypal.repository.InvoiceRepository;
import com.paypal.utils.DateUtils;

@Service
public class InvoiceServiceImpl implements IInvoiceService {

	@Autowired
	InvoiceRepository invoiceRepository;

	@Override
	public List<Invoice> findInvoices(String processDate) {		
		try {			
			return invoiceRepository.findByCreatedDate(DateUtils.getStringToDate(processDate));			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	 
}
