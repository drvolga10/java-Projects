package com.sampleLambda.test;

public class JavaAnonymous {
	public static void main(String [] args)
	{
		Greetings gretings=new Greetings() {
			
			@Override
			public void sayHello(String name) {System.out.println("hello"+name);
				
			}
		};
		gretings.sayHello(" volga");
	}

}
