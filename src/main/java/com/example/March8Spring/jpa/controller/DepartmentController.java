package com.example.March8Spring.jpa.controller;

import com.example.March8Spring.jpa.dao.DepartmentDao;
import com.example.March8Spring.jpa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentDao departmentDao;
    @PostMapping("/saveDept")
    public String saveDept(@RequestBody Department department){
        return departmentDao.saveDepartment(department);

    }


}
