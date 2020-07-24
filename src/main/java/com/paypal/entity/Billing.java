package com.paypal.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "billings")
@Entity
public class Billing extends BaseEntity {

	@Id
	@GeneratedValue
	@Column(name = "billing_id")
	private int billingId;

	@Column(name = "invoice_id")
	private int invoiceId;

	@Column(name = "payment_date")
	private LocalDate paymentDate;

	@Column(name = "paid_by")
	private String paidBy;

	@Column(name = "remaining_amount")
	private Double remainingAmount;

	@Column(name = "fee")
	private Double fee;

	public Billing() {

	}

	public int getBillingId() {
		return billingId;
	}

	public void setBillingId(int billingId) {
		this.billingId = billingId;
	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaidBy() {
		return paidBy;
	}

	public void setPaidBy(String paidBy) {
		this.paidBy = paidBy;
	}

	public Double getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(Double remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		return "Billing [billingId=" + billingId + ", invoiceId=" + invoiceId + ", paymentDate=" + paymentDate
				+ ", paidBy=" + paidBy + ", remainingAmount=" + remainingAmount + ", fee=" + fee + "]";
	}

}
