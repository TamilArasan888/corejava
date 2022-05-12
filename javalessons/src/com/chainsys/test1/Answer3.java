package com.chainsys.test1;
import java.util.Scanner;

public class Answer3 {
	public static void main(String[] args)
	{
		thirdanswer();
	}
	public static void thirdanswer()
	{
		int remainder,quot,cube=0,sum=0;
		System.out.println("Enter 3 digit number : ");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		int dupnum=num;
		for(int i=0;i<3;i++)
		{
			remainder=num%10;
			cube=remainder*remainder*remainder;
			sum+=cube;
			quot=num/10;
			num=quot;
		}
		
		System.out.println("The sum of cube of your number is :"+sum);
		if(dupnum==sum)
		{
			System.out.println("Same as input number!! ");
		}
		else
		{
			System.out.println("Different number!! ");
		}
}

}
