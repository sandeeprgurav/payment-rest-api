package com.paypal.service;

import java.util.List;

import com.paypal.entity.Invoice;

public interface IInvoiceService {

	List<Invoice> findInvoices(String  processDate);
	
}
