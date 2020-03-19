package com.java8.basics;


public class Greeter {

	public void greet(Greeting greeting) {
		greeting.Perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
	//inner class way	
		greeter.greet(new Greeting() {
			
			@Override
			public void Perform() {
				System.out.println("Hello!!");
			}
		});
		//lambda way
		Greeting greeting = () -> System.out.println("Java 8 Way  -> Hello !!");
		
		greeter.greet(greeting);
		
		
	}
}
