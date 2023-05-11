package com.example.March8Spring.jpa.controller;

import com.example.March8Spring.jpa.dao.EmployeeDao;
import com.example.March8Spring.jpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;
    @PostMapping("/saveEmployee")
    public String saveEmp(@RequestBody Employee employee){
        return employeeDao.saveEmployee(employee);
    }

}
