package com.chainsys.test1;

public class Answer4 {

	public static void main(String[] args) {
		forthanswer();
		
	}
	public static void forthanswer()
	{
		
		String s2="Tom and jerry are good friends";
        String[] splits=s2.split(" ");
        int count=splits.length;
        System.out.println("1. The word count : "+count);
		
        
        char stringarray[]=s2.toCharArray();
        int len=s2.length();
        System.out.print("2.");
		
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(stringarray[i]);


		}
		}
	}


