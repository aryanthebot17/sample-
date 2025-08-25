package learning_java;


import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

public class TakeWhileDoWhile {
	
	public static void main(String[] args) {
		
		List<Integer> nums=Arrays.asList(1,2,3,4,5,6,1,7);
		
		List<Integer>take = nums.stream().takeWhile(i->i<5)
				.collect(Collectors.toList());
		
		System.out.println(take);
		
		List<Integer>  drop= nums.stream().dropWhile(i->i<5)
				.collect(Collectors.toList())
				;
		
		System.out.println(drop);
		
	}

}
