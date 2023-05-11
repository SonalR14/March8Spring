package com.example.March8Spring.jpa.dao;

import com.example.March8Spring.jpa.entity.Customers;
import com.example.March8Spring.jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {
    @Autowired
    private CustomerRepository customerRepository;
    public String addCustomer(Customers customer){
        customerRepository.save(customer);
        return "customer Added Successfully!!!";
    }
}
