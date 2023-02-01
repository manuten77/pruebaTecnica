package com.etenuta.shop.Persistence;

import java.time.LocalDateTime;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "prices")
public class Prices {
 @Id 
 @GeneratedValue(strategy = GenerationType.AUTO)
 private Integer id;
 private Integer brandId;
 private LocalDateTime startDate;
 private LocalDateTime endDate;
 private int priceList;
 private Integer productId;
 private int priority;
 private float price;
 private String curr;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public Integer getBrandId() {
	return brandId;
}
public void setBrandId(Integer brandId) {
	this.brandId = brandId;
}
public LocalDateTime getStartDate() {
	return startDate;
}
public void setStartDate(LocalDateTime startDate) {
	this.startDate = startDate;
}
public LocalDateTime getEndDate() {
	return endDate;
}
public void setEndDate(LocalDateTime endDate) {
	this.endDate = endDate;
}
public int getPriceList() {
	return priceList;
}
public void setPriceList(int priceList) {
	this.priceList = priceList;
}
public Integer getProductId() {
	return productId;
}
public void setProductId(Integer productId) {
	this.productId = productId;
}
public int getPriority() {
	return priority;
}
public void setPriority(int priority) {
	this.priority = priority;
}
public float getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}
public String getCurr() {
	return curr;
}
public void setCurr(String curr) {
	this.curr = curr;
}
 
}
