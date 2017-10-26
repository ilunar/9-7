package com.pvt.DAO.Impl;

import com.pvt.model.Employee;
import javax.persistence.EntityManager;
import com.pvt.DAO.EmployeeDao;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
    @PersistenceContext
    private EntityManager em;
    
    public void addEmployee(Employee emp){
        em.persist(emp);
    }

    public Employee getEmployee(Integer employeeId){
        return em.find(Employee.class,employeeId);
    }
    
    public void deleteEmployee(Integer employeeId){
        em.remove(employeeId);
    }
    /*public void sendEmployeeToMeeting(Integer employeeId, Integer meetingId) {
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            Meeting meet= (Meeting) session.get(Meeting.class, meetingId);
            Employee emp = (Employee) session.get(Employee.class, employeeId);
            if (emp!=null&& meet!=null){
                emp.getMeetings().add(meet);
                System.out.println("*****Employee with a id="+employeeId+" send to meeting with a id= "+meetingId);
            }
            else {System.out.println("*****incorrect employeeId or meetingId");}
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            log.log(Level.WARNING,"can't sendEmployeeToMeeting", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }*/
}
