package com.example.March8Spring.jpa.dao;

import com.example.March8Spring.jpa.entity.Products;
import com.example.March8Spring.jpa.repository.ProductsRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {
    @Autowired
    private ProductsRepository productsRepository;
    public String addProduct(Products product){
        productsRepository.save(product);
        return "Product Added Successfully";

    }

}
