package core.annotations;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerMain {
	
	public static void main(String [] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("Annotationsbased.xml");
		
		Customer cust=ctx.getBean("cust",Customer.class);
		System.out.println(cust.getCode() + " " +cust.getCustName()+cust.getAddress());
		
	 
		
	}

}