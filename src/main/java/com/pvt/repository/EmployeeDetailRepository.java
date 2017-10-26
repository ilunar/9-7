package com.pvt.repository;

import com.pvt.model.EmployeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDetailRepository extends JpaRepository<EmployeeDetail, Integer> {
    
}
