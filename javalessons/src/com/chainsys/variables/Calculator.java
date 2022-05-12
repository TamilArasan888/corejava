package com.chainsys.variables;
/**
 * 
 * @author tami3130
 * created on : 25 mar 2022
 */

public class Calculator {
	/**
	 * Add method : will take 2 integer values using the following parameters
	 * and will add the values.The result of totaling will be returned as back to the caller
	 * This is static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 * 
	 */
	public static int add(int param1,int param2)
	{
		int result=param1+param2;
		return result;
	}
	/**
	 * multiply method : will take 2 integer values using the following parameters
	 * and will multiply the values.The product result of totaling will be returned as back to the caller
	 * This is static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 * 
	 */
	public static int multiply(int param1,int param2)
	{
		int result=param1*param2;
		return result;
	}
	/**
	 * divide method : will take 2 integer values using the following parameters
	 * and will divide the values.
	 * The result will be returned as back to the caller
	 * This is static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 * 
	 */
	public static int divide(int param1,int param2)
	{
		int result=param1/param2;
		return result;
	}
	/**
	 * subtract method : will take 2 integer values using the following parameters
	 * and will find difference between the values.
	 * The result will be returned back to the caller
	 * This is static method, object reference is not required.
	 * 
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 * 
	 */
	public static int subtract(int param1,int param2)
	{
		int result=param1-param2;
		return result;
	}

}
