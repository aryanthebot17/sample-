package com.sutherland.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int empId;
	@Column(length= 40)
	private String empName;
	@Column
	private double salary;
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public Employee(int a) {
		this.empId=a;
	}


}
