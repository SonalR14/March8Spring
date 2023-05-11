package com.example.March8Spring.jpa.dao;

import com.example.March8Spring.jpa.entity.Department;
import com.example.March8Spring.jpa.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class DepartmentDao {
    @Autowired
    private DepartmentRepository departmentRepository;
    public String saveDepartment(Department department){
        departmentRepository.save(department);
        return "Department saved successfully";
    }

}
