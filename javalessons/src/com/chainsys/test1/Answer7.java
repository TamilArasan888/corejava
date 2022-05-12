package com.chainsys.test1;
import java.util.Scanner;

public class Answer7 {

	public static void main(String[] args) {
		seventhAnswer();
	}

	public static void seventhAnswer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		sc.close();
		

		
		String nameInUpperCase=name.toUpperCase();
		
		nameInUpperCase=nameInUpperCase.trim();
		
		char[] upperCaseArray=nameInUpperCase.toCharArray();
		
		int lengthOfArray=upperCaseArray.length;
		
		int asciivalue=0;
		for(int index=0;index<lengthOfArray;index++) 
			{
			asciivalue=(int)upperCaseArray[index];
			
			if(asciivalue<65 || asciivalue>90)
			{
				
			if(asciivalue!=32)
			   {
					System.out.println("Invalid character in name.");
//					return;
				}
			}
		}
		
		if(lengthOfArray<8)
		{
				System.out.println("Name must have atleast 8 characters.");
		}
		else {
			System.out.println("Your name have more than 8 characters.");
		}
	}	
}
