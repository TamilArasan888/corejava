package com.chainsys.strings;

public class StringLessonA {
	
	public static void lessonone()
	{
		//String is an array of characters
		String firststring = "Chainsys";
		System.out.println(firststring);
		char dataone[]= {'C','h','a','i','n'};
		String secondstring=new String(dataone);
		System.out.println(secondstring);
		String thirdstring=new String(new char[]{'C','h','a','i','n'});
		System.out.println(thirdstring);
		}
	
	public static void lessontwo() {
		String firststring="hello";
		String secondstring="hello";
//		String thirdstring="hello";
//		int firstnumber=100;
//		int secondnumber=100;
//		int thirdnumber=100;
		System.out.println(firststring);
		System.out.println(secondstring);
		firststring="Welcome";
		System.out.println(firststring);
		System.out.println(secondstring);
		}
	
//	public static void creatingStringInaForloop() 
//	{
//		for(int count=0;count<10;count++) 
//		{
//			String s1="Hello";
//		
//		}
//	}
	
	public static void stringToCharArray()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a WORD : ");
		String firststring=scanner.nextLine();
		scanner.close();
		int stringlength=firststring.length();
		System.out.println("Length : "+stringlength);
		char[] data= firststring.toCharArray();
		int dataarraylength=data.length;
		System.out.println("Length : "+dataarraylength);
		
	}
	
	public static void stringToUpperLower()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter a WORD : ");
		String firststring=scanner.nextLine();
		scanner.close();
		System.out.println(firststring);
		String stringinuppercase=firststring.toUpperCase();
		System.out.println("Touppercase : "+stringinuppercase);
		//string in firststring is not modified,because strings are immutuable
		System.out.println("s1=" +firststring);
		String stringinlowercase=firststring.toLowerCase();
		System.out.println("Tolowercase : "+stringinlowercase);
		System.out.println("s1="+firststring);
		
//		substring
//		from 4th char till end
		String substring=firststring.substring(3);
		System.out.println(substring);
		
//		from 3rd char to 6th char (i.e.excluding 7th char)
//		from index 2 to index 5
		substring=firststring.substring(2,6);
		System.out.println(substring);
		
//		replace
		String replacedstring=firststring.replace('a','e');
		System.out.println(replacedstring);
		
//		equals
		boolean flag1=firststring.equals(stringinuppercase);//false
		System.out.println(flag1);
		
//		equalsIgnorecase
		boolean flag=firststring.equalsIgnoreCase(stringinuppercase);//true
		System.out.println(flag);
		
		
	}
	
	 
	public static void testStringtrim()
	{
		String secondstring="      Hope       it            rain";
		System.out.println("Before trim :"+secondstring.length());
		secondstring=secondstring.trim();
		System.out.println("After trim : "+secondstring.length());
	}

	public static void testSplit()
	{
		String firststring="    tom and jerrry are good friends     ";
		String trimmedstring=firststring.trim();
		String[] data=trimmedstring.split(" ");
		int count=data.length;
		System.out.println("Word count :"+count);
		for(int index=0;index<count;index++)
		{
			System.out.println(data[index]);
		}
	}
	
	public static void testSplitDays()
	{
		String weekdays="mon,tues,we,thurs,fri,satur,sun";
		String[] data=weekdays.split(" ,");
		int count=data.length;
		System.out.println("Days count :"+count);
		for(int index=0;index<count;index++)
		{
			System.out.println(data[index]);
		}
	}
	
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

	public static void verifystring(String s1)
	{
		if(null==s1)
		{
			System.out.println("String is null");
			return;
		}
		else
			System.out.println("String is not null : "+s1);
		if(!s1.isEmpty())
			System.out.println("\tNot Empty");
		else
			System.out.println("\t String is empty");
		
		
	}

}