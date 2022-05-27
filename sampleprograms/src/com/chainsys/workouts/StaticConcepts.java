package com.chainsys.workouts;

public class StaticConcepts {

	static
	{
		System.out.println("Hello from static");
	}
	
	public static void name() {
		System.out.println("Name from static method");
	}
	private static void age() {
		System.out.println(" age from private static method :");
	}
	
	public static void main(String[] args) {
		
		name();
		age();
	}

}
