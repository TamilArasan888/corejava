package com.chainsys.introduction;
import java.util.Scanner;

public class Fourth {

	
	public static void main(String[] args) {
	    taskA();
		taskB();
		taskC();
		taskD();
	}
		public static void taskA() {
			System.out.println("what is your name");
			Scanner sc=new Scanner(System.in);

			String name=sc.nextLine();
			//sc.close();
			System.out.println(name);
			}
		
		public static void taskB() {
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a number");
			int firstvalue=sc.nextInt();
			int result=firstvalue*100;
			System.out.println(result);
//			sc.close();
			}
		public static void taskC() {
			String s1="100";
			String s2="100";
			System.out.println(s1+s2);
			int x=Integer.parseInt(s1);
			int y=Integer.parseInt(s2);
			int z=x+y;
			System.out.println(z);
			
		}
		public static void taskD() {
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("Enter your age:");
			int age=sc.nextInt();
			sc.close();
			if(age<=0)
			{
				System.out.println("Invalid age...");
			}
			if(age<18) 
			{
				System.out.println("You are not eligible drive.");
			}
			else
			{
				System.out.println("You are eligible to drive.");
			}
			
			
			
		}
		}
	

		
	
