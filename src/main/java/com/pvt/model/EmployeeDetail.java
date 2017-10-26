package com.pvt.model;

import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "employeedetail")
public class EmployeeDetail implements java.io.Serializable {
    private Integer employeeId;
    private Employee employee;
    private String street;
    private String sity;
    private String state;
    private String country;
    
    @GenericGenerator(name = "generator", strategy = "foreign",
	parameters = @Parameter(name = "property", value = "employee"))
    @Id
    @GeneratedValue(generator = "generator")
    @Column(name = "employeeId", unique = true, nullable = false)
    public Integer getEmployeeId() {return employeeId;}
    public void setEmployeeId(Integer employeeId) {this.employeeId = employeeId;}
    
    @OneToOne(fetch = FetchType.EAGER)
    @PrimaryKeyJoinColumn
    public Employee getEmployee() {return employee;}
    public void setEmployee(Employee employee) {this.employee = employee;}
    
    @Column(name = "street", nullable = false)
    public String getStreet() {return street;}
    public void setStreet(String street) {this.street = street;}
    
    @Column(name = "sity", nullable = false)
    public String getSity() {return sity;}
    public void setSity(String sity) {this.sity = sity;}
    
    @Column(name = "state", nullable = false)
    public String getState() {return state;}
    public void setState(String state) {this.state = state;}
    
    @Column(name = "country", nullable = false)
    public String getCountry() {return country;}
    public void setCountry(String country) {this.country = country;}
    
    public String toString(){
        return "\tstreet="+this.getStreet()+" sity="+this.getSity()
                +" state="+this.getState()+" country="+this.getCountry();
    }
}
