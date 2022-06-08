package com.order.Entity;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Order {
	@Id
	private String totalAmount;
	private Date orderDate;
	private orderlineStatus orderStatus;
	private Address address;
	@OneToOne(cascade = CascadeType.ALL)
	private Address addresses;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_orderline_id",referencedColumnName = "orderline_id")
	private List<Orderline>orderLines;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public orderlineStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(orderlineStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	
	public Address getAddresses() {
		return addresses;
	}
	public void setAddresses(Address addresses) {
		this.addresses = addresses;
	}
	public List<Orderline> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<Orderline> orderLines) {
		this.orderLines = orderLines;
	}
	
	

}
