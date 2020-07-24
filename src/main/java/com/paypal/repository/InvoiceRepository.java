package com.paypal.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.entity.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	
	List<Invoice> findAll();

	List<Invoice> findByCreatedDate(LocalDate processDate);	
}
