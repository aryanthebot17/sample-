package com.sutherland.main;



import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import com.sutherland.entity.Employee;

public class EmployeeAppLn {
  
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory = config.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tran = session.beginTransaction();
		
		
		
		Employee emp1= new Employee();
		emp1.setEmpId(3456);
		emp1.setEmpName("aryan ");
		emp1.setSalary(8000);
		
		session.save(emp1);
		tran.commit();
		session.close();
		factory.close();
		
		
		
		
	}
}
