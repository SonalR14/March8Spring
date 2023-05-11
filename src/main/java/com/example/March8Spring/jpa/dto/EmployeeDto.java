package com.example.March8Spring.jpa.dto;

import com.example.March8Spring.jpa.entity.Department;

import java.util.List;

public class EmployeeDto {
    private Department department;
    private List<EmployeeData> employeeList;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<EmployeeData> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<EmployeeData> employeeList) {
        this.employeeList = employeeList;
    }
}
