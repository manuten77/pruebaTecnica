package com.etenuta.shop.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etenuta.shop.Persistence.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
