
package com.pvt.DAO.Impl;

import com.pvt.model.EmployeeDetail;
import com.pvt.DAO.EmployeeDetailDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

@Component
public class EmployeeDetailDaoImpl implements EmployeeDetailDao {
    @PersistenceContext
    private EntityManager em;
    
    public EmployeeDetail getEmployeeDetail(Integer employeeId){
        return em.find(EmployeeDetail.class,employeeId);
    }

    /*public void updateEmployeeDetail(EmployeeDetail eD){
        Session session = null;
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.update(eD);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            session.getTransaction().rollback();
            log.log(Level.WARNING,"can't updateEmployeeDetail", e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }*/
}
