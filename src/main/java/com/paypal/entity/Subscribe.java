package com.paypal.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@SqlResultSetMapping(name="pricingDetails",
classes= {
		@ConstructorResult(
				targetClass=PricingDetails.class,
				columns= {
						@ColumnResult(name="customer_id", type=Integer.class),
						@ColumnResult(name="first_name", type=String.class),
						@ColumnResult(name="last_name", type=String.class),
						@ColumnResult(name="amount", type=Double.class),
						@ColumnResult(name="remaining_amount", type=Double.class)						
				}
				)
})

@NamedNativeQuery(name ="Subscribe.getPricingDetails" ,query="SELECT d.customer_id, d.first_name,d.last_name, a.amount,c.remaining_amount \r\n" + 
		"FROM INVOICES a inner join SUBSCRIPTIONS b on a.invoice_id=b.invoice_id \r\n" + 
		"                                inner join billings c on c.invoice_id = b.invoice_id \r\n" + 
		"                               inner join customers d on d.customer_id = c.invoice_id   \r\n" + 
		"where b.customer_id=:customerId", 
		resultSetMapping="pricingDetails")


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
