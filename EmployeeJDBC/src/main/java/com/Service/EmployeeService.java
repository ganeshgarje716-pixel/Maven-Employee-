package com.Service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.Dao.EmployeeDao;
import com.Entity.Employee;
import com.Exception.EmployeeIsNullException;
import com.Exception.EmployeeNotFoundException;
import com.Exception.EmployeesNotFoundException;
import com.Exception.SomthingWentWrongException;

public class EmployeeService {
	
	EmployeeDao dao=new EmployeeDao();
	
	
	public String insert(Employee employee) {
		
		if (employee == null) {
			
			throw new EmployeeIsNullException("Employee is null");
		}
		String msg = dao.insertEmployee(employee);
		
		return msg;
	}
	
	
	public String update(Employee employee) {
		
		String msg = dao.updateEmployee(employee);
		
        if (msg==null) {
			
			throw new SomthingWentWrongException("Cheak your sql query again");
		}
		
		return msg;
	}
	
	
    public String delete(int id) throws SQLException {
    	
    	String msg = dao.delete(id);
    	
        if (msg==null) {
			
			throw new SQLException("Id Not Found");
		}
    	
    	return msg;
    }
    
    
    
    public Employee  get(int id) {
    	
    	Employee employee = dao.getEmployee(id);
    	
        if (employee == null) {
			
			throw new EmployeeNotFoundException("Employee Not Found With Id = "+id);
		}
    	
    	return employee;
    }
    
    
    public ArrayList<Employee> getAll() {
    	
    	ArrayList<Employee> employees = dao.getAllEmployee();
    	
        if (employees.isEmpty()) {
			
			throw new EmployeesNotFoundException("No Employee Present in DB");
		}
    	
    	return employees;
    }
    

}
