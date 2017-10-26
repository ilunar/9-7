package com.pvt.services;

import com.pvt.Dao.DepartmentDao;
import com.pvt.model.Department;
import com.pvt.repository.DepartmentRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    
    @Transactional
    public void addDepartment(Department dep) {
	departmentRepository.saveAndFlush(dep);
    }
    
    @Transactional
    public Department getDepartment(Integer id) {
        Department d=departmentRepository.getOne(id);
        Hibernate.initialize(d);
	return d;
    }
    
    @Transactional
    public void deleteDepartment(Integer id) {
	departmentRepository.delete(id);
    }
}
