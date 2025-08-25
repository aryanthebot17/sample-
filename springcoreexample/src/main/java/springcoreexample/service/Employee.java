package springcoreexample.service;

public class Employee {
	
	private int id;
	private String name;
	
	private int salary;
	
	public Employee(int a , String b , int c) {
	this.id=a;
	this.name=b;
	this.salary=c;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
