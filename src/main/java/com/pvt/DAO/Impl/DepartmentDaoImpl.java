
package com.pvt.DAO.Impl;

import com.pvt.model.Department;
import com.pvt.Dao.DepartmentDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

@Component
public class DepartmentDaoImpl implements DepartmentDao {
    @PersistenceContext
    private EntityManager em;

    public void addDepartment(Department dep) {
        em.persist(dep);
    }

    public Department getDepartment(Integer departmentId){
        return em.find(Department.class,departmentId);
    }

    public void deleteDepartment(Integer departmentId) {
        em.remove(departmentId); 
    }
}
