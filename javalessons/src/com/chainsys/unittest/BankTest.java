package com.chainsys.unittest;

import com.chainsys.variables.Bank;

/**
 * 
 * @author tami3130
 *
 */
public class BankTest {

	public static void testdeposit() {
		System.out.println("Before balance:" + Bank.currentamount);
		Bank.deposit(10000);
		System.out.println("After balance:" + Bank.currentamount);

	}
	public static void testwithdraw() {
		System.out.println("Before balance:"+Bank.currentamount);
		int withdraw=Bank.withdraw(5000);
		System.out.println("Total Amount :"+withdraw);
		System.out.println("After balance :"+Bank.currentamount);

	}
	public static void testopenaccount() {
		Bank.openaccount("Tamilarasan",9877682);
		System.out.println(Bank.cusname);
		System.out.println(Bank.accnumber);

	}
}
