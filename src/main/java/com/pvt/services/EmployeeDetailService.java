package com.pvt.services;

import com.pvt.model.EmployeeDetail;
import com.pvt.repository.EmployeeDetailRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeDetailService {
    @Autowired
    private EmployeeDetailRepository employeeDetailRepository;
    
    @Transactional
    public EmployeeDetail getEmployeeDetail(Integer id) {
	EmployeeDetail ed=employeeDetailRepository.getOne(id);
        Hibernate.initialize(ed);
	return ed;
    }
}
