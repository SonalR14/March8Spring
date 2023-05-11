package com.example.March8Spring.jpa.repository;

import com.example.March8Spring.jpa.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customers,Long> {
}
