package com.etenuta.shop.Persistence;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String description;

	public Product(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
}
