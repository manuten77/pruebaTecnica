package com.etenuta.shop.Persistence;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity
@Table(name = "brands")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String description;

	public Brand(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}
	
}
