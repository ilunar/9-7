package com.pvt.Dao;
import com.pvt.model.Department;
public interface DepartmentDao {
    public void addDepartment(Department dep);
    public Department getDepartment(Integer departmentId);
    public void deleteDepartment(Integer departmentId);
}
