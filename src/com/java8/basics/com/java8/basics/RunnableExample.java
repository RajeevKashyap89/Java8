package com.java8.basics;

public class RunnableExample {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("inner class Way of runnable!!");

			}
		});
		thread.start();
		// labmbda Way

		Thread lambdaThread = new Thread(() -> System.out.println("Lambda Way of runnable!!"));
		lambdaThread.start();

	}
}
