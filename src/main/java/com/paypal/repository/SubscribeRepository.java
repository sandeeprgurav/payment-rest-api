package com.paypal.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.paypal.entity.PricingDetails;
import com.paypal.entity.Subscribe;

@Repository
public interface SubscribeRepository extends JpaRepository<Subscribe, Long> {
	List<Subscribe> findByOrderDate(LocalDate orderDate);

	@Query(nativeQuery=true)
	List<PricingDetails> getPricingDetails(@Param("customerId") String customerId);
}
