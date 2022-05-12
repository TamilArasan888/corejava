package com.chainsys.test1;

public class Answer1 {

	public static void main(String[] args)
	{
		firstanswer();
	}
	public static void firstanswer()
	{
	
		for(int i=1;i<=100;i++)
		{
			
			if(i%3==0 && i%5==0)
			{
				System.out.println("FizzBuzz");
				continue;
			}
			else if(i%3==0)
			{
				
				System.out.println("Fizz");
				continue;
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
				continue;
			}
			
			System.out.println(i);
		}
	}
}
