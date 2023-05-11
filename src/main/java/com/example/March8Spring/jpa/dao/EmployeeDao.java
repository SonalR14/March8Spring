package com.example.March8Spring.jpa.dao;

import com.example.March8Spring.jpa.entity.Employee;
import com.example.March8Spring.jpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
    @Autowired
    private EmployeeRepository employeeRepository;

    public String saveEmployee(Employee employee){
        employeeRepository.save(employee);
        return "Emplyee Added Succcessfully!!!!";
    }
}
