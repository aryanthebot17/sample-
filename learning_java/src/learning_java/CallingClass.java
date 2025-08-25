package learning_java;


import java.util.ArrayList;
public class CallingClass {

	 public static void main(String[] args) {
		 
		ArrayList<StudentRecord> lis= new ArrayList<StudentRecord>();
		
		lis.add(new StudentRecord(1,"aryan"));
		lis.add(new StudentRecord(2,"Sudhanshu"));
		lis.add(new StudentRecord(3,"sumit"));
		
		
		System.out.println(lis.get(0).regno());
		System.out.println("James Gosling released a white paper Saying \n\"Multiple Inheritance is Completely Removed in Java\"");
		
		
		String week ="mon";
		
		String message= switch(week) {
		case "mon"->message="working day";
		default-> message= "not a valid week";
		
		};
		
		week ="sat";
		String  a=switch(week) {
		case "mon"->{yield "a working day";}
		case "sat"->
		default-> {yield "just a holiday";}
		};
		
		System.out.println(message);
		System.out.println(a);
		 
		 
		 
		 
	 }
}
 