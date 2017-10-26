package com.pvt.DAO;
import com.pvt.model.Meeting;
public interface MeetingDao {
    public void addMeeting(Meeting meet); 
    public Meeting getMeeting(Integer meetingId);
    public void deleteMeeting(Integer meetingId);
}
