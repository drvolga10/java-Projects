package com.sampleLambda.test;

public class JavaLambda {

	
	public static void main(String args[])
	{
		Greetings greetings=n->System.out.println("Hello "+n);
		greetings.sayHello("volga");
	}
}
