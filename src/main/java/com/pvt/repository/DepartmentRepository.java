package com.pvt.repository;

import com.pvt.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department, Integer> {}
