package sampleStreamsGenerate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
	
	public static void main(String[] args) {
		
		List<String> data = Arrays.asList("java", "not", "in", "use");
		
		/**
		 * Intermediate Opn:Intermediate operations which return another Stream which allows operations to be connected in a form of a query
		 */
		//FILTER:operation helps eliminate elements based on certain criteria.
		//data.stream().filter(line->!line.contains("n")).forEach(System.out::println);
		
		
		//MAP:operation helps map elements to the corresponding results.
		//data.stream().filter((s)->s.startsWith("n")).map(String::toUpperCase).forEach(System.out::println);
		
		//SORTED:operation helps sort elements based on certain criteria.
		//data.stream().sorted().filter((s)->!s.startsWith("n")).map(String::toUpperCase).forEach(System.out::println);
		
		/**
		 * Terminal operations produces a non-stream, result such as primitive value, a collection or no value at all.
		 */
		
		//FOREACH:foreach operations helps iterate the elements of the Stream.
		//data.stream().forEach(System.out::println);
		
		//COLLECT: operation helps to collect the stream result in a collection like list.
		
		List<String> collectedList=data.stream().sorted().collect(Collectors.toList());
		//System.out.println(collectedList);
		
		//ANYMATCH: operation returns a boolean depending upon the condition applied on stream data.
		boolean test=data.stream().anyMatch((s)->s.startsWith("j"));
		//System.out.println(test);
		
		//COUNT:operation return the aggregate count for stream data.
		//System.out.println(data.stream().filter(line->!line.contains("n")).count());
		
	}


}
