package com.pvt.model;

import java.util.*;
import javax.persistence.*;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "departments", uniqueConstraints =@UniqueConstraint(columnNames = "departmentId"))
public class Department implements java.io.Serializable {
    private Integer departmentId;
    private String departmentName;
    private Set<Employee> employees=new HashSet<Employee>(0);
    
    @Id
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    @Column(name = "departmentId", unique = true, nullable = false)
    public Integer getDepartmentId() {return departmentId;}
    public void setDepartmentId(Integer departmentId) {this.departmentId = departmentId;}
    
    @Column(name = "departmentName", nullable = false)
    public String getDepartmentName() {return departmentName;}
    public void setDepartmentName(String departmentName) {this.departmentName = departmentName;}
    
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "department",cascade = CascadeType.ALL)
    public Set<Employee> getEmployees() {return employees;}
    public void setEmployees(Set<Employee> employees) {this.employees = employees;}
    
    public String toString(){
        return "\tdepartmentId="+this.getDepartmentId()+" departmentName="+this.getDepartmentName();
    }
}
