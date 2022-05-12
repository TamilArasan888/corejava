package com.chainsys.unittest;



import com.chainsys.variables.Demoa;

/**
 * Tester class for global variables
 * 
 * @author tami3130
 * @category to test Demoa class,its field and methods date:mar 24 2022
 */

public class VariableTester {
	/**
	 * test static variable
	 */
	public static void testGlobalVariables() {
		/**display the value of static field
		* value is zero(default value)
		* DataA is accessed without creating an object
		*/
		System.out.println("DataA:" + Demoa.DataA);
		/** display the value of immutable field
		* this is not possible without an object
		// System.out.println("DataB:"+Demoa.DataB);
		* display the value of constant field
		*/
		System.out.println("DataC:" + Demoa.DataC);
		//modifying value of the static field DataA
		Demoa.DataA=2345;
		System.out.println("DataA:" + Demoa.DataA);
		/**modifying value of the static field DataC
		* ERROR:The final field demoC cannot be assigned 
		* Demoa.DataC=2345;
		*/
	}
		/**
		 * to test how to use immutable variables of a class
		 * created on : 25 mar 2022
		 */
		public static void testImmutableVariable() 
		{
			
			/* cannot make a static references to the non static field Demoa.DataB*/
			//Demoa.DataB=123;
			/** 
			 * first create an object or the class
			 * pass an int value as an argument to the constructor
			 * access the immutable instance field using the object reference
			 */
			Demoa firstobject=new Demoa(123);
			System.out.println(firstobject.DataB);
			/**
			 * value assigned to an immutable field cannot be changed
			 * value for the immutable field can be assigned only through the constructors
			 */
			//firstobject.DataB=567;
		}
		/** calling non-static method using object reference
		 * without creating an object,non-static methods cannot be called
		 * created on : 25 mar 2022
		 */
		public static void testStaticMethod() 
		{
			//ERROR
			//Demoa.sayhello();
			
		}
		public static void testNonStaticMethod() 
		{
			//ERROR
			//Demoa.greetuser();
			Demoa firstobject=new Demoa(111);
			//call the non static method
			firstobject.greetuser();
		}
		
		
		}
	


