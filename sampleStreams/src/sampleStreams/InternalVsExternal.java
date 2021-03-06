package sampleStreams;

import java.util.ArrayList;
import java.util.List;

public class InternalVsExternal {
	
	public static void main(String args[])
	{
		List<String> list=new ArrayList<>();
		list.add("v11");
		list.add("v12");
		list.add("v13");
		list.add("v14");
		list.add("v15");
		list.add("v16");
		processListInternally(list);
		//processListExternally(list);
	}
	
	private static void processListInternally(List<String> list)
	{
		list.stream().filter(item->!"v11".equalsIgnoreCase(item)).forEach(item->System.out.println(item));
	}
	
	private static void processListExternally(List<String> list)
	{
		for(String string: list)
		{
			System.out.println(string);
		}
	}

}
