package learning_java;


import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class HashMapLearn {
	
	public static void main(String[] args) {
		
	
	 Map<String,Integer> data = new HashMap<String,Integer>();
	 data.put("java",123);
	 data.put("aryan",1234);
	 data.put("hello",12345);
	 
	 Set<Entry<String,Integer>> set = data.entrySet();
	 
	 Iterator<Entry<String,Integer>>  itr = set.iterator();
	 
	 while(itr.hasNext()) {
		 System.out.println(itr.next());
	 }
	 
	 
}
	 

}
