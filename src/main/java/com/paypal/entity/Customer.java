package com.paypal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "customers")
@Entity
public class Customer extends BaseEntity {

	@Id
	@GeneratedValue
	@Column(name = "customer_id")
	private int customer_id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private boolean lastName;

	@Column(name = "phone")
	private Number phone;

	@Column(name = "address")
	private String address;

	public Customer() {

	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isLastName() {
		return lastName;
	}

	public void setLastName(boolean lastName) {
		this.lastName = lastName;
	}

	public Number getPhone() {
		return phone;
	}

	public void setPhone(Number phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + ", address=" + address + "]";
	}
	
}
