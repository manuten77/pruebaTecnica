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

 
}
