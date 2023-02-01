package com.etenuta.shop.Persistence;

import java.time.LocalDateTime;

public class Result {
	private  int tarifa;
	private String brandName;
	private String productName;
	private float price;
	private LocalDateTime appDateTime;
	public int getTarifa() {
		return tarifa;
	}
	public void setTarifa(int tarifa) {
		this.tarifa = tarifa;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public LocalDateTime getAppDateTime() {
		return appDateTime;
	}
	public void setAppDateTime(LocalDateTime appDateTime) {
		this.appDateTime = appDateTime;
	}

}
