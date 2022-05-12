package com.chainsys.test1;
import java.util.Scanner;

public class Answer6 {

	public static void main(String[] args) {
		sixthanswer();
	}
	public static void sixthanswer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\tWeather\n1.If it raining (press 1)\n2.If the temperature is lesser than 32 degrees (press 2)\n3.If the temperature in between 32 to 50 degrees (press 3)\n4.If nothing will happens (press 4)");
		System.out.println("Enter your choice: ");
		int choice=sc.nextInt();
		sc.close();
		switch(choice)
		{
		case 1:
			System.out.println("GO AND GET AN UMBRELLA!");
			break;
		case 2:
			System.out.println("BRING A HEAVY JACKET!");
			break;
		case 3:
			System.out.println("BRING A LIGHT JACKET!");
			break;
		case 4:
			System.out.println("NO JACKET IS NEEDED!");
			break;
		}
	}

}
