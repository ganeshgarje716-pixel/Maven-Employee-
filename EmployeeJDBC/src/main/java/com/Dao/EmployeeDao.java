package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.Entity.Employee;
import com.jdbcConnection.JDBCUtil;

public class EmployeeDao {
	
	
	Connection con = JDBCUtil.createConnection();
	
	
	
//	public void createTable() {
//		
//		try {
//			
//			PreparedStatement pst = con.prepareStatement("create table employee(id int, name varchar(50), salary double, dep varchar(50), gender varchar(50), city varchar(50))");
//			
//			pst.execute();
//			
//			System.out.println("Create Table");
//		} 
//		catch (SQLException e) {
//			
//			e.printStackTrace();
//		}	
//		
//	}
	
	
	
	public String insertEmployee(Employee employee) {
		
		
		try {
			
			PreparedStatement pst = con.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
			
			pst.setInt(1, employee.getId());
			pst.setString(2, employee.getName());
			pst.setDouble(3, employee.getSalary());
			pst.setString(4, employee.getDep());
			pst.setString(5, employee.getGender());
			pst.setString(6, employee.getCity());
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Employee Inserted Successfully";
	}
	
	
	
	public String updateEmployee(Employee employee) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("update employee set name=?, salary=?, gender=?, dep=?, city=? where id=? ");
			
			pst.setString(1, employee.getName());
			pst.setDouble(2, employee.getSalary());
			pst.setString(3, employee.getDep());
			pst.setString(4, employee.getGender());
			pst.setString(5, employee.getCity());
			pst.setInt(6, employee.getId());
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Employee Update Successfully";
	}
	
	
	
	public String delete(int id) {
		
		try {
			
			PreparedStatement pst = con.prepareStatement("delete from employee where id=?");
			
			pst.setInt(1, id);
			
			pst.executeUpdate();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return "Employee delete Successfully";
	}
	
	
	
	public Employee getEmployee(int id) {
		
		Employee employee = null;
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from employee where id=?");
			
			pst.setInt(1, id);
			
		    ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
				int id1 = rs.getInt("id");
				String name = rs.getString("name");
				double salary = rs.getDouble("salary");
				String dep = rs.getString("dep");	
				String gender = rs.getString("gender");
				String city = rs.getString("city");
				
				 employee=new Employee(id1, name, salary, dep, gender, city);
				}
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return employee;
	}
	
	
	
	 public ArrayList<Employee> getAllEmployee() {
			
    	 ArrayList<Employee> employees=new ArrayList<Employee>();
    	 
		Employee employee = null;
		
		try {
			
			PreparedStatement pst = con.prepareStatement("select * from Employee");
			
			
			ResultSet rs = pst.executeQuery();
			
			while (rs.next()) {
				
			int id1 = rs.getInt("id");
			String name = rs.getString("name");
			double salary = rs.getDouble("salary");
			String dep = rs.getString("dep");	
			String gender = rs.getString("gender");
			String city = rs.getString("city");
			
			employee=new Employee(id1, name, salary, dep, gender, city);
			
			employees.add(employee);
			}
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		return employees;
	}
	

}
