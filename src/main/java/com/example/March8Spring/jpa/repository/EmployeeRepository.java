package com.example.March8Spring.jpa.repository;

import com.example.March8Spring.jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository< Employee,Long>{
}
