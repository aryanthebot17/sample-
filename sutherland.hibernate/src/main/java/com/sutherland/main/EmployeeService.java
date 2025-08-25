package com.sutherland.main;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sutherland.entity.Employee;

@Service
public class EmployeeService {

	 static List<Employee> emplist;
	 
	 static {
		 
	   emplist=Arrays.asList(  (new Employee(2)),(new Employee(4)));
		 
	 }

	public List<Employee> getEmployee() {
		// TODO Auto-generated method stub
		return  this.emplist;
	}

}
