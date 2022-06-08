package com.order.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orderline {
	@Id
	@Column(name="orderline_id")
	private String iteam;
	private float price;
	private int quantity;
	private int eta;
	private String status;
	public String getIteam() {
		return iteam;
	}
	public void setIteam(String iteam) {
		this.iteam = iteam;
	}
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
	

}
