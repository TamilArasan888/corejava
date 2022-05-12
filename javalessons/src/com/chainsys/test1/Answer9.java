package com.chainsys.test1;
import java.util.Scanner;
public class Answer9 {
	
	public static String cusName,cusAddr,cusEmail,empName,empAddr,empEmail;
	public static long cusAccNum,cusPhNo,empID,empPhNo;
	
	public static void main(String[] args) 
	{
		
		findCustOrEmployee();
	}

	public static void findCustOrEmployee()
	{
		System.out.println("\t\t    Welcome to ABC Bank!!!\n\t\t What service you want to do?\nIf you want to create customer datails press 1 \n or You are an Employee of this bank please press any number key!");
		Scanner sc=new Scanner(System.in);
		int choice1=sc.nextInt();
		if(choice1==1)
		{
			getCustomerDetails();
		}
		else
		{
			getEmployeeDetails();
		}
	}
	
	public static void getCustomerDetails() 
	{
		System.out.println("\tEnter Your Details");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Account Number :");
		cusAccNum=sc.nextInt();
		System.out.println("Enter Your Phone number :");
		cusPhNo=sc.nextLong();
		System.out.println( " ");
		String use = sc.nextLine();
		System.out.println("Enter Your E-Mail id :");
		cusEmail=sc.nextLine();
		System.out.println("Enter Your name :");
		cusName=sc.nextLine();
		System.out.println("Enter Your Address :");
		cusAddr=sc.nextLine();

		System.out.println("If you want to see your details press 1.\n Else press any number.");
		int choice2=sc.nextInt();
		if(choice2==1)
		{
			showCustomerDetails();
		}
		else
		{
			
			return;
		}
	}
	
	public static void getEmployeeDetails() 
	{
		System.out.println("\tEmployee Details");
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your EmpID :");
		empID=sc.nextInt();
		System.out.println("Enter Your Phone number :");
		empPhNo=sc.nextLong();
		System.out.println( " ");
		String use = sc.nextLine();
		System.out.println("Enter Your E-Mail id :");
		empEmail=sc.nextLine();
		System.out.println("Enter Your name :");
		empName=sc.nextLine();
		System.out.println("Enter Your Address :");
		empAddr=sc.nextLine();
		System.out.println("If you want to see your details press 1.\n Else press any number.");

		int choice3=sc.nextInt();
		if(choice3==1)
		{
			showEmployeeDetails();
		}
		else
		{
			return;
		}
		sc.close();
	}
	
	public static void showCustomerDetails()
	{
		System.out.println("\tCustomer Details");
		System.out.println("Your Account Number: "+cusAccNum);
		System.out.println("Your Phone Number: "+cusPhNo);
		System.out.println("Your E-Mail ID :"+cusEmail);
		System.out.println("Your Name : "+cusName);
		System.out.println("Your Address : "+cusAddr);
	}
	
	public static void showEmployeeDetails()
	{
		System.out.println("\tEmployee Details");
		System.out.println("Your Employee ID"+empID);
		System.out.println("Your Phone Number: "+empPhNo);
		System.out.println("Your E-Mail ID :"+empEmail);
		System.out.println("Your Name : "+empName);
		System.out.println("Your Address : "+empAddr);
	}
	
}                                                           
