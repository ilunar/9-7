package com.pvt.DAO.Impl;

import com.pvt.model.Meeting;
import com.pvt.DAO.MeetingDao;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Component;

@Component
public class MeetingDaoImpl implements MeetingDao {
    @PersistenceContext
    private EntityManager em;

    public void addMeeting(Meeting meet){
        em.persist(meet);
    }

    public Meeting getMeeting(Integer meetingId){
        return em.find(Meeting.class,meetingId);
    }    

    public void deleteMeeting(Integer meetingId){
        em.remove(meetingId);
    }
}
