package com.Entity;

public class Employee {
	
	
	private int id;
	
	private String name;
	
	private double salary;
	
	private String dep;
	
	private String gender;
	
	private String city;
	
	
	

	public Employee(int id, String name, double salary, String dep, String gender, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.dep = dep;
		this.gender = gender;
		this.city = city;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public double getSalary() {
		return salary;
	}




	public void setSalary(double salary) {
		this.salary = salary;
	}




	public String getDep() {
		return dep;
	}




	public void setDep(String dep) {
		this.dep = dep;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public String getCity() {
		return city;
	}




	public void setCity(String city) {
		this.city = city;
	}




	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", dep=" + dep + ", gender=" + gender
				+ ", city=" + city + "]";
	}
	
	
	
	
	
	
	

}
