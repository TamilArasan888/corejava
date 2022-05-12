package com.chainsys.introduction;

public class Fifth {

	public static void main(String[] args) {
		printnumbersonetoten();
		printnumberstentoone();
		printmatrix();
		printtriangle();
		printop();
		printeven();
	}
	
	public static void printnumbersonetoten() {
		int count=0;
		for(count=0;count<=10;count++) 
		{
			System.out.print(count+" ");
		}
		System.out.println("\n");
	}
	
	public static void printnumberstentoone() {
		int count=0;
		for(count=10;count>=1;count--) 
		{
			System.out.print(count+" ");
		}
		System.out.println("\n");
	}
	
	public static void printmatrix() {
			int countA=0;
			for(countA=1;countA<=5;countA++) 
			{
				for(int countB=1;countB<=10;countB++)
				{
				System.out.print(countB+" ");
		
				}

				System.out.println();

			}
			System.out.println("\n");
			}
	

          public static void printtriangle() {
	
        	  int countA=0;
        	  for(countA=1;countA<=10;countA++) 
        	  {
        		  for(int countB=10;countB>countA;countB--)
        		  {
        			  System.out.print(".");
        		
        		  }
        		  for(int countC=countA;countC>=1;countC--)
        		  {
        			  System.out.print(countC);
        		  }
        		  System.out.println();
        	  }
        	  System.out.println("\n");
        	  
}
	public static void printop() {

		int countA = 0;

		for (countA = 1; countA <= 10; countA++) 
		{
			for (int countB = 5; countB > countA; countB--) 
			{
				System.out.print(".");
			}
			
			if (countA < 6) 
			{
				for (int countC = countA; countC >= 1; countC--)
				{
					System.out.print(countC);
				}

				for (int countD = 2; countD <= countA; countD++) 
				{
					System.out.print(countD);
				}
			}

			System.out.println();
		}
	}

	public static void printeven() {
	
		for(int i=2;i<100;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}}
	}
