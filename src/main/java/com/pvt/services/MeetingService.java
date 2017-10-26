package com.pvt.services;

import com.pvt.model.Meeting;
import com.pvt.repository.MeetingRepository;
import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class MeetingService {
    @Autowired
    private MeetingRepository meetingRepository;
    
    @Transactional
    public void addMeeting(Meeting meet) {
	meetingRepository.saveAndFlush(meet);
    }
    
    @Transactional
    public Meeting getMeeting(Integer id) {
	Meeting m=meetingRepository.getOne(id);
        Hibernate.initialize(m);
	return m;
    }
    
    @Transactional
    public void deleteMeeting(Integer id) {
	meetingRepository.delete(id);
    }
}
