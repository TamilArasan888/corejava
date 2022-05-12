package com.chainsys.variables;

public class Demoa {
	public static int DataA;//static global variable
	public final int DataB;// immutable global variable(not static)
	public final static int DataC = 300;// constant
	//non static member
	//constructor
	/*
	 * constructor is a special method
	 * the name of the constructor and the name of the class will be same
	 * constructor don"t have return type.
	 * constructors can take parameters
	 */
	public Demoa(int dataB) 
	{
		/*Assigning value to the global read-only field(this.DataB)*/
		this.DataB = dataB;
	}
	/**
	 * static method can be called without an object
	 */
	public static void sayhello() {
		System.out.println("Hello developer");
	}
	/**
	 * greetuser is a non static method
	 */

	public void greetuser() {
		System.out.println("Greeting user!!!");
	}

}
