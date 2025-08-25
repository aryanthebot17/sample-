package learning_java;

import java.util.ArrayList;
public class StudentResults {
	 
	private ArrayList<Student> list;
	
	
	public StudentResults() {
		this.list= new ArrayList<Student>();
		
	}
	
	
	
	public void setData(Student stud) {
		this.list.add(stud);
	}
	
	
	public  float total(int index ) {
		
	
	return (this.list).get(index).getTotal();
	}
	
	public float avg(int index) {
		
		return  total(index)/3;
	}
	
	// pass or fail for the index;
	
	public void pass(int index) {
		
	  if(this.list.get(index).pass()) {
		  System.out.println("pass");
	  }
	  
	  else {
		  System.out.println("fail");
	  }
	}
}
	


