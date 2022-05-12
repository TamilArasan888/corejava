package com.chainsys.test1;

public class Answer8 
{
	public static void main(String[] args)
	{
		eigthanswer();
	}
	public static void eigthanswer()
	{

		for (int A1 = 1; A1 <10; A1++) 
		{
			for (int B1 = 9; B1 > A1; B1--) 
			{
				System.out.print(".");
			}
			
			{
			for (int C3 = A1; C3 >= 1; C3--)
				{
					System.out.print(C3);
				}

				for (int D4 = 2; D4 <= A1; D4++) 
				{
					System.out.print(D4);
				}
			}

			System.out.println();
		}
	}
		
}


