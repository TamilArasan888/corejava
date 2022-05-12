package com.chainsys.test1;

public class Answer2 {

	
	public static void main(String[] args)
	{
		secondanswer();
	}
	public static void secondanswer()
	{
		int givennumber[]= {1,5,4,6,9,0,3};
		System.out.println("The Even numbers in 1546903 are : ");

		for(int i=0;i<givennumber.length;i++)
		{

			if(givennumber[i]%2==0)
			{
				System.out.println(givennumber[i]);

			}
			
			
		}
		
	}
	
}
