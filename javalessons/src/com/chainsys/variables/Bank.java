package com.chainsys.variables;
//import java.util.Scanner;
/**
 * 
 * @author tami3130
 *
 */

public class Bank {
	
	public static int currentamount;
	public static String cusname;
	public static int accnumber;
	
	public static int deposit(int paramount) 
	{
		
		currentamount = currentamount + paramount;
		return paramount;
	}

	public static int withdraw(int paramount) 
	{
		currentamount = currentamount -paramount;
		return paramount;
	}

	public static void openaccount(String parname,int paraccnum) 
	{
		cusname=parname;
		accnumber=paraccnum;
	}

}
