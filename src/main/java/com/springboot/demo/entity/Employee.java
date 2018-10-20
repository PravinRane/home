package com.springboot.demo.entity;

public class Employee {
	
	private int empid;
	private String empname;
	private int salary;
	
	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Employee() {
		
	}
	
	public Employee(int empid, String empname) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = ((int)(Math.random()*100000));
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}

}
