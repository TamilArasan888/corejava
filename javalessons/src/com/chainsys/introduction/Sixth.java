package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {

	public static void main(String[] args) {
		checkusername();
		findevennumbers();
		swapoftwovariable();
		
	}
	public static void checkusername() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String username=sc.nextLine();
		//sc.close();
		System.out.println("Name is: "+username);
		char[] nameascharacters=username.toCharArray();
		int lengthofchararray=nameascharacters.length;
		System.out.println("Length of your name is:"+lengthofchararray);
		if(lengthofchararray<3)
		{
			System.out.println("Name must have atleast 3 characters.");
			return;
		}
		if(lengthofchararray>15)
		{
			System.out.println("Name must NOT have more than 15 characters.");
			return;
			}
		String nameinuppercase=username.toUpperCase();
		nameinuppercase=nameinuppercase.trim();
		char[] uppercasechararray=nameinuppercase.toCharArray();
		lengthofchararray=uppercasechararray.length;
		int asciivalue=0;
		for(int index=0;index<lengthofchararray;index++) {
			asciivalue=(int)uppercasechararray[index];
			System.out.println("ASCII : "+asciivalue);
			if(asciivalue<65 || asciivalue>90) {
				if(asciivalue!=32) {
					System.out.println("Invalid character in name.");
					return;
				}
			}
		}
		
		for(int index=0;index<lengthofchararray;index++)
		{
			System.out.println(index+ " " +nameascharacters[index]);
		}
	}
	
	
	
	public static void findevennumbers() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any 10 digit number");
		long value=sc.nextLong();
		sc.close();
		long num=value;
		long remainder=0;
		while(num>0) {
			remainder=num%10;
			if(remainder%2==0) {
				System.out.println(remainder);
			}
			num=num/10;
			}
	}
	public static void swapoftwovariable() {
		int a=10,b=20;
		System.out.println("The two numbers values before swap a and b is" +a +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swaping the values is a and b is" +a +b);
		
	}
	}



