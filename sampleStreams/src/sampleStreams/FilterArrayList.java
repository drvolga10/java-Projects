package sampleStreams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterArrayList {
	
	public static void main(String[] args) {
		
		
		List<String> listNames = (List) Arrays.asList("Amit","Kumar","Bhagat","Ricky");
		
		System.out.println("List Names : " + listNames);
		
		listNames.stream().filter(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// TODO Auto-generated method stub
				return !t.equals("Kumar");
			}
		 
		}).forEach(t -> System.out.println(t));
	}

}
