package com.sushma.java.forex.common.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "Customer")
@Table(name = "customer")
public class Customer extends BaseEntity{
	
	@Column(name = "customer_name", length = 25)
	private String customerName;
	
	@Column(name = "customer_description", length = 1000)
	private String customerDescription;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerDescription() {
		return customerDescription;
	}

	public void setCustomerDescription(String customerDescription) {
		this.customerDescription = customerDescription;
	}

	
}
