package com.Main;

import java.util.ArrayList;
import java.util.Scanner;

import com.Controller.EmployeeController;
import com.Entity.Employee;

public class EmployeeMain {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		EmployeeController controller=new EmployeeController();
		
		
		while (true) {
			
			
			System.out.println("1.Insert Employee");
			System.out.println("2.Update Employee By Id");
			System.out.println("3.Delete Employee By Id");
			System.out.println("4.get Employee By Id");
			System.out.println("5.Get All Employees");
			System.out.println("6.Exit");
			
			System.out.println("Enter Your Choise = ");
			int no=sc.nextInt();
			
			
			if (no == 1) {
				
				
				System.out.println("Enter Id =");
				int id=sc.nextInt();
				
				System.out.println("Enter Name =");
				String name=sc.next();
				
				System.out.println("Enter Salary =");
				double salary=sc.nextDouble();
				
				System.out.println("Enter Dep =");
				String dep=sc.next();
				
				System.out.println("Enter Gender =");
				String gender=sc.next();
				
				System.out.println("Entetr City =");
				String city=sc.next();
				
				
				try {
					
					System.out.println(controller.insert(new Employee(id, name, salary, dep, gender, city)));
				} 
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			
			break;
			}
			
			
			
			else if (no == 2) {
				
				
				
				System.out.println("Enter Id =");
				int id=sc.nextInt();
				
				System.out.println("Enter Name =");
				String name=sc.next();
				
				System.out.println("Enter Salary =");
				double salary=sc.nextDouble();
				
				System.out.println("Enter Dep =");
				String dep=sc.next();
				
				System.out.println("Enter Gender =");
				String gender=sc.next();
				
				System.out.println("Entetr City =");
				String city=sc.next();
				
				
				try {
					
					System.out.println(controller.update(new Employee(id, name, salary, dep, gender, city)));
				} 
				catch (Exception e) {
				
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			
			break;	
			}
			
			
			
			else if (no == 3) {
				
				
				System.out.println("Enter Id =");
				int id=sc.nextInt();
				
				
				try {
					
					System.out.println(controller.delete(id));
				} 
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			
			break;	
			}
			
			
			
			else if (no == 4) {
				
				
				System.out.println("Enter Id =");
				int id=sc.nextInt();
				
				
				try {
					
					Employee employee = controller.get(id);
					
					System.out.println("Id     = "+employee.getId());
					System.out.println("Name   = "+employee.getName());
					System.out.println("Salary = "+employee.getSalary());
					System.out.println("Dep    = "+employee.getDep());
					System.out.println("Gender = "+employee.getGender());
					System.out.println("City   = "+employee.getCity());
					
				} 
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			
			break;	
			}
			
			
			
			else if (no == 5) {
				
				
				try {
					
					ArrayList<Employee> all = controller.getAll();
					
					for (Employee emp : all) {
						
						System.out.println("Id     = "+emp.getId());
						System.out.println("Name   = "+emp.getName());
						System.out.println("Salary = "+emp.getSalary());
						System.out.println("Dep    = "+emp.getDep());
						System.out.println("Gender = "+emp.getGender());
						System.out.println("City   = "+emp.getCity());
						
						System.out.println("=================================");
					}
					
				} 
				catch (Exception e) {
					
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
				
			break;	
			}
			
			
			
			else if (no==6) {
				
                System.out.println("Thank You");
				
			break;
			}
			
			
			
		}
		
		
		
		
		
		
		
		
	}
	
	
	


}
