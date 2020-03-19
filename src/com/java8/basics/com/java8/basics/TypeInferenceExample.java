package com.java8.basics;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLength strLength = str -> str.length();
		printLength(strLength);
	}

	
	public static void printLength(StringLength str) {
		System.out.println(str.getLength("Hello Java 8"));
	}
}

interface StringLength {
	int getLength(String str);
}
