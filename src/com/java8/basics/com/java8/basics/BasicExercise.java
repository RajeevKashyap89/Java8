package com.java8.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BasicExercise {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("raj", "aaaj", 31), new Person("jan", "ebr", 31),
				new Person("casda", "vasdsad", 31), new Person("kar", "adsf", 31), new Person("ssc", "cmm", 31));

		// sort list by last name

		// java 7 way
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		//printElements(people);
	
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				if (p.getLastName().startsWith("c")) {
					return true;
				}
				return false;
			}

		});
		
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				
				return true;
			}

		});
		
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				if (p.getFirstName().startsWith("c")) {
					return true;
				}
				return false;
			}

		});
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
