package learning_java;

public record  StudentRecord(int regno , String stdname){
  
	public int regno() {
		return regno;
	}
	
	public String  stdname() {
		return stdname;
	}
}



