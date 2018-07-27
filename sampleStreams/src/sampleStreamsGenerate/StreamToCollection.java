package sampleStreamsGenerate;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamToCollection {
	

	public static void main(String[] args) {
		Stream<String> stringSteam=Stream.of("1","2","3");
		
		//Using Collectors interface to convert stream to collection
		List<String> list=stringSteam.collect(Collectors.toList());		
		list.forEach(System.out::println);
		
		
		//using Stream.toArray() to convert stream to Array
		Stream<Integer> intSteam=Stream.of(1,2,3);
		Integer[] intArr=intSteam.toArray(Integer[]::new);
		System.out.println(intArr[0]);
	}

}
