package com.paypal.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.paypal.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long> {
	
	List<Billing> findByCreatedDate(LocalDate processDate);	
}
