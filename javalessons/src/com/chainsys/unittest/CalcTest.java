package com.chainsys.unittest;
import com.chainsys.variables.Calculator;
/**
 * this class is for testing the Calculator class and its method
 * Methods to test
 * <list>
 	* add(param1,param2)
 	* multiply(param1,param2)
 	* divide(param1,param2)
 	* sub(param1,param2)
 * <list>
 * @author tami3130
 * created on : 25 mar 2022
 */

public class CalcTest {
	public static void testadd()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.add(arg1, arg2);
		System.out.println("Result of addition is :"+output);
		
	}
	public static void testmultiply()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.multiply(arg1, arg2);
		System.out.println("Result of multipliaction is :"+output);	
	}
	public static void testdivide()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.divide(arg1, arg2);
		System.out.println("Result of division is :"+output);
	}
	public static void testsubtract()
	{
		int arg1=100;
		int arg2=50;
		int output=Calculator.subtract(arg1, arg2);
		System.out.println("Result of subtraction is :"+output);
	}
	

}
