package com.java8.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicExerciseUsingLambda {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("raj", "aaaj", 31), new Person("jan", "ebr", 31),
				new Person("casda", "vasdsad", 31), new Person("kar", "adsf", 31), new Person("ssc", "cmm", 31));

		// sort list by last name

		// java 8 way
		Comparator<Person> comp = (p1, p2) -> p1.getLastName().compareTo(p2.getLastName());
		Collections.sort(people, comp);

		// printElements(people);
		System.out.println("printing Person with LastName as C");
		printConditionally(people, p -> p.getLastName().startsWith("c"));
		System.out.println("printing Person with FirstName as C");
		printConditionally(people, p -> p.getFirstName().startsWith("c"));

		System.out.println("printing all ppl");
		printConditionally(people,p -> true);
	}

//	public static void printElements(List<Person> ppl) {
//
//		for (Person p : ppl) {
//			System.out.println(p);
//		}
//
//	}

	public static void printConditionally(List<Person> ppl, Condition condition) {

		for (Person p : ppl) {
			if (condition.test(p)) {
				System.out.println(p);
			}
		}
		System.out.println("****************************");
	}

	interface Condition {
		boolean test(Person p);
	}
}
