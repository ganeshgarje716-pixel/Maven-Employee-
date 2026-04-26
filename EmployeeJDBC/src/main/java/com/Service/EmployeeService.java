package com.Service;

import java.util.ArrayList;

import com.Dao.EmployeeDao;
import com.Entity.Employee;

public class EmployeeService {
	
	EmployeeDao dao=new EmployeeDao();
	
	
	public String insert(Employee employee) {
		
		String msg = dao.insertEmployee(employee);
		
		return msg;
	}
	
	
	public String update(Employee employee) {
		
		String msg = dao.updateEmployee(employee);
		
		return msg;
	}
	
	
    public String delete(int id) {
    	
    	String msg = dao.delete(id);
    	
    	return msg;
    }
    
    
    
    public Employee  get(int id) {
    	
    	Employee employee = dao.getEmployee(id);
    	
    	return employee;
    }
    
    
    public ArrayList<Employee> getAll() {
    	
    	ArrayList<Employee> employees = dao.getAllEmployee();
    	
    	return employees;
    }
    

}
