package com.paypal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "invoices")
@Entity
public class Invoice extends BaseEntity {

	@Id
	@GeneratedValue
	@Column(name = "invoice_id")
	private int invoiceId;

	@Column(name = "amount")
	private Double amount;

	@Column(name = "tax")
	private Double tax;

	@Column(name = "supplier")
	private String supplier;

	@Column(name = "invoice_number")
	private String invoiceNumber;

	@Column(name = "description")
	private String description;

	public Invoice() {

	}

	public int getInvoiceId() {
		return invoiceId;
	}

	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getInvoiceNumber() {
		return invoiceNumber;
	}

	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "Invoice [invoiceId=" + invoiceId + ", amount=" + amount + ", tax=" + tax + ", supplier=" + supplier
				+ ", invoiceNumber=" + invoiceNumber + ", description=" + description + "]";
	}

}
