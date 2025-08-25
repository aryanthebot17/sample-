package learning_java;

import java.util.Scanner;

public class Student {
	 
	private int regno;
	private String Studentname;
	private float sub1_marks;
	private float  sub2_marks;
	private float sub3_marks;
	
	
	public Student() {
		
		
	}
	public Student(int regno, String Studentname,float sub1_marks,float sub2_marks,float sub3_marks){
		
	this.regno=regno;
	this.Studentname=Studentname;
	this.sub1_marks=sub1_marks;
	this.sub2_marks=sub2_marks;
	this.sub3_marks=sub3_marks;
	}
	
	public float getTotal() {
		return this.sub1_marks+this.sub2_marks+this.sub3_marks;
	}
	
	public boolean pass() {
		if(this.sub1_marks>40&&this.sub2_marks>40&&sub3_marks>40) {return true;}
		
		return false;
	}
	
	
	

}
