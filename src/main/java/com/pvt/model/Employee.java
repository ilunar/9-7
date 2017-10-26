package com.pvt.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employees", uniqueConstraints =@UniqueConstraint(columnNames = "employeeId"))
public class Employee implements java.io.Serializable {
    
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String cellPhone;
    private EmployeeDetail employeeDetail;
    private Department department;
    private Set<Meeting>meetings=new HashSet<Meeting>(0);
    
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "employeeId", unique = true, nullable = false)
    public Integer getEmployeeId() {return employeeId;}
    public void setEmployeeId(Integer employeeId) {this.employeeId = employeeId;}
    
    @Column(name = "firstName", nullable = false)
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    
    @Column(name = "lastName",nullable = false)
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    
    @Column(name = "cellPhone", nullable = false)
    public String getCellPhone() {return cellPhone;}
    public void setCellPhone(String cellPhone) {this.cellPhone = cellPhone;}
    
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "employee")
    public EmployeeDetail getEmployeeDetail() {return employeeDetail;}
    public void setEmployeeDetail(EmployeeDetail employeeDetail) {this.employeeDetail = employeeDetail;}
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "departmentId", nullable = false)
    public Department getDepartment() {return department;}
    public void setDepartment(Department department) {this.department = department;}
    
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(name = "employee_meeting",
        joinColumns = {@JoinColumn(name = "meetingId", nullable = false) },
	inverseJoinColumns = {@JoinColumn(name = "employeeId", nullable = false)}
    )
    public Set<Meeting> getMeetings() {return meetings;}
    public void setMeetings(Set<Meeting> meetings) {this.meetings = meetings;}
    
    public Employee() {}
    
    public String toString(){
        return "\tId="+this.getEmployeeId()+" firstname="+this.getFirstName()
                +" lastname="+this.getLastName()+" cellphone="+this.getCellPhone()
                +"\n"+this.getDepartment().toString()
                +"\n"+this.employeeDetail.toString();
    }
}


