package com.pvt.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "meetings", uniqueConstraints =@UniqueConstraint(columnNames = "meetingId"))
public class Meeting implements java.io.Serializable {
    private Integer meetingId;
    private String topic;
    private Set<Employee> employees=new HashSet<Employee>(0);

    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "meetingId", unique = true, nullable = false)
    public Integer getMeetingId() {return meetingId;}
    public void setMeetingId(Integer meetingId) {this.meetingId = meetingId;}
    
    @Column(name = "topic", nullable = false)
    public String getTopic() {return topic;}
    public void setTopic(String topic) {this.topic = topic;}
    
    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "meetings")
    public Set<Employee> getEmployees() {return employees;}
    public void setEmployees(Set<Employee> employees) {this.employees = employees;}
    
    public String toString(){
        return "\tmeetingId="+this.getMeetingId()+" topic="+this.getTopic();
    }
}
