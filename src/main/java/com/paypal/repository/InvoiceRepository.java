package com.paypal.repository;

import java.time.LocalDate;
import java.time.Year;
import java.time.YearMonth;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.paypal.entity.Invoice;

@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
	
	List<Invoice> findAll();

	List<Invoice> findByCreatedDate(LocalDate processDate);
	
    @Query(value="SELECT a.* FROM INVOICES a inner join SUBSCRIPTIONS b on a.invoice_id=b.invoice_id and b.customer_id=?1 and a.created_date=?2", nativeQuery=true)
	List<Invoice> filterByCustomerIdAndProcessDate(String customerId, LocalDate processDate);

    @Query(value="SELECT a.* FROM INVOICES a inner join SUBSCRIPTIONS b on a.invoice_id=b.invoice_id and b.customer_id=?1 and EXTRACT(year FROM a.created_date)||'-' ||EXTRACT(month FROM a.created_date) = ?2", nativeQuery=true)
	List<Invoice> filterByCustomerIdAndProcessYearMonth(String customerId, String processYearMonth);

    @Query(value="SELECT a.* FROM INVOICES a inner join SUBSCRIPTIONS b on a.invoice_id=b.invoice_id and b.customer_id=?1 and EXTRACT(year FROM a.created_date) = ?2", nativeQuery=true)
	List<Invoice> filterByCustomerIdAndYear(String customerId, String processYear);
    
}
