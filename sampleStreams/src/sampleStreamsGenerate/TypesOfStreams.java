package sampleStreamsGenerate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class TypesOfStreams {

	public static void main(String[] args) {
		
		getFromArray();
		streamFromColleaction();
		streamFromGenerate();
		streamFromIterate();
		streamFromRegex();
		
	}
	
	private static void getFromArray()
	{
		Stream<String> test=null;
		
		String arr[]= {"1","2","3"};
		
		//Using Arrays.stream method to return streams
		test=Arrays.stream(arr);
		
		
		//using Stream interface for creating stream.
		test=Stream.of(arr);
		
		test.forEach(System.out::println);
	}
	
	private  static void streamFromColleaction() {
		List<String> names=new ArrayList<>();
		names.add("Volga");
		names.add("R");
		names.add("M");
		names.add("A");
		
		//Generating anonymous stream from stream() method of collection
		names.stream().forEach(name->System.out.println(name));
	}
	
	
	private static void streamFromGenerate()
	{
		//Using Stream.generate() method to generate stream
		Stream<String> testStream=Stream.generate(()->"hello").limit(10);
		testStream.forEach(System.out::println);
	}
	
	private static void streamFromIterate()
	{
		Stream<Long> testStream=Stream.iterate(1L, n->n+1).limit(10);
		testStream.forEach(x->System.out.println(x));
	}
	
	private static void streamFromRegex()
	{
		String test="This is java";
		
		Stream<String> testStream=Pattern.compile(" ").splitAsStream(test);
		testStream.forEach(System.out::println);
	}
}
