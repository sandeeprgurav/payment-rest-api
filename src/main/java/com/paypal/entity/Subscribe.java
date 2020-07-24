package com.paypal.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "subscriptions")
@Entity
public class Subscribe {

	@Id
	@GeneratedValue
	@Column(name = "subscription_id")
	private int subscriptionId;

	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "invoice_id")
	private int invoiceId;

	@Column(name = "order_date")
	private LocalDate orderDate;

	public Subscribe() {

	}

	public int getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Subscribe [subscriptionId=" + subscriptionId + ", customerId=" + customerId + ", invoiceId=" + invoiceId
				+ ", orderDate=" + orderDate + "]";
	}

}
