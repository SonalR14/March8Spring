package com.example.March8Spring.jpa.repository;

import com.example.March8Spring.jpa.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
