package com.chainsys.strings;

public class Reversestring {
	
	public static void reverse()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the sentence  : ");
		String sentence="";
		try {
			sentence=sc.nextLine();
			
		}
		finally {
			sc.close();
			
		}
		char array[]=sentence.toCharArray();
		
		int len=sentence.length();
		for(int i=len-1;i>=0;i--) 
		{
			System.out.print(array[i]);
			
	}
}

}
