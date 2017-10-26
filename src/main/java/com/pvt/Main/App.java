package com.pvt.Main;

import com.pvt.model.Department;
import com.pvt.services.DepartmentService;
import com.pvt.services.EmployeeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
        DepartmentService depService = context.getBean(DepartmentService.class);
	EmployeeService empService=context.getBean(EmployeeService.class);
        
        Department dep=new Department();
        dep.setDepartmentName("CEO");
        
	depService.addDepartment(dep);
        System.out.println(depService.getDepartment(4).getEmployees());
	System.out.println(empService.getEmployee(5));
	
        
    }
}

