package learning_java;

public interface Arthimetic {
   
	int add(int x, int y );
	
	default void display() {
		System.out.println("this is the default message");
		
	}
     static void message() {
    	 System.out.println("this is the static message");
     }
	
}
