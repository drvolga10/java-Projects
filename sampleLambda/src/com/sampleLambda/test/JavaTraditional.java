package com.sampleLambda.test;

public class JavaTraditional implements Greetings{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
		
	}
	
	public static void main(String args)
	{
		JavaTraditional javaTraditional=new JavaTraditional();
		javaTraditional.sayHello("volga");
	}
}
