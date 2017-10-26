package com.pvt.services;

import com.pvt.model.Employee;
import com.pvt.repository.EmployeeRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Transactional
    public void addEmployee(Employee emp) {
	employeeRepository.saveAndFlush(emp);
    }
    
    @Transactional
    public Employee getEmployee(Integer id) {
	Employee e=employeeRepository.getOne(id);
        Hibernate.initialize(e);
	return e;
    }
    
    @Transactional
    public void deleteEmployee(Integer id) {
	employeeRepository.delete(id);
    }
}
