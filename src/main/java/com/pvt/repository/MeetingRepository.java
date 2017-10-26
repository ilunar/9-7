package com.pvt.repository;

import com.pvt.model.Meeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingRepository extends JpaRepository<Meeting, Integer> {
    
}
