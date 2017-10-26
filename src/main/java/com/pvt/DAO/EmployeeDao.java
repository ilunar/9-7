package com.pvt.DAO;
import com.pvt.model.Employee;
public interface EmployeeDao {
    public void addEmployee(Employee e);
    public Employee getEmployee(Integer employeeId);
    public void deleteEmployee(Integer employeeId);
    //void sendEmployeeToMeeting(Integer employeeId, Integer meetingId);
}
