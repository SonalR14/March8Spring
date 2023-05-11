package com.example.March8Spring.jpa.repository;

import com.example.March8Spring.jpa.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Long> {
}
