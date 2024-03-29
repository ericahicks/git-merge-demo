package com.skillstorm;

/*
 * This class contains the main method that prints out the greeting methods of each person.
 * Each method is named after the person who is greeting themselves.
 * 
 * The purpose of this code is to practice git branching, git merging, and Pull Requests. 
 */
public class Hello {
	
	public static void main(String[] args) {
		// TODO implement the method named after you 
		// Have the method return a String containing a greeting message
		// Call your method without overwriting anyone else's method call
		System.out.println(erica());
		System.out.println(abdelnasser());
		System.out.println(rod());
		System.out.println(sam());
	}
	
	private static String erica() {
		return "Hello! This is Erica."
				+ " How are you?";
	}
	
	private static String abdelnasser() {
		return "Hello, Nasser was here TWICE!";
	}
	
	private static String carlos() {
		return "";
	}
	
	private static String hunter() {
		return "";
	}
	
	private static String josh() {
		return "";
	}
	
	private static String matt() {
		return "";
	}
	
	private static String rod() {
		return "Konnichiwa.  Watashiwa Rod desu.  Dozo yoroshiku!";
	}
	
	private static String sam() {
		return "Hello, this is Sam. How are you?";
	}
	
	private static String sean() {
		return "Fun Fact: Collections.sort() uses Quicksort for collections of primitives.";
	}

}
