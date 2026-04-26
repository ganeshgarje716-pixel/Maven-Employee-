package com.Controller;

import java.util.ArrayList;

import com.Entity.Employee;
import com.Service.EmployeeService;

public class EmployeeController {

	
	EmployeeService service=new EmployeeService();
	
	
	
	public String insert(Employee employee) {
		
		 return service.insert(employee);
	}
	
	
	public String update(Employee employee) {
		
		return service.update(employee);
	}
	
	
	public String delete(int id) {
		
		 return service.delete(id);
	}
	
	
	public Employee get(int id) {
		
		return service.get(id);
	}
	
	
	public ArrayList<Employee> getAll() {
		
		return service.getAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
