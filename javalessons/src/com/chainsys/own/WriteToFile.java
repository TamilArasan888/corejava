//package com.chainsys.own;
//import java.util.*;
//import java.io.*;
//
//public class WriteToFile {
//
//	WriteToFile wtf=new WriteToFile();
//	
//	public void writeFile()
//	{
//		Scanner s=new Scanner(System.in);
//		String str;
//		str=s.nextLine();
//		
//		byte b[]=str.getBytes();
//		System.out.println("The length :"+b.length);
//		FileOutputStream fos=new FileOutputStream("d:/file.txt");
//		
//		for(int j=0;j<b.length;j++)
//		{
//			fos.write(b[j]);
//		}
//		
//		
//			fos.close();
//		
//		
//	}
//	
//	public static void main(String[] args) {
//		wtf.writeFile();
//	}	
//
//}
