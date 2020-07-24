package com.paypal.service;

import java.util.List;

import com.paypal.entity.Invoice;

public interface IInvoiceService {

	List<Invoice> findInvoices(String  processDate);

	List<Invoice> filterByCustomerIdAndProcessYearMonth(String customerId, String processDate);

	List<Invoice> filterByCustomerIdAndProcessDate(String customerId, String processDate);

	List<Invoice> filterByCustomerIdAndProcessYear(String customerId, String processYear);
	
}
