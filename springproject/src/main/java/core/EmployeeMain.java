package core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeeMain {
	
	public static void main(String [] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springconfig.xml");
		
		Employee std =(Employee)ctx.getBean("emp");
		System.out.println(std.getCode() + " " +std.getEmpname());
		
	 
		
	}

}
