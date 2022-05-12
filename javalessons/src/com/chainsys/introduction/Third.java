package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) {
		// primitive datatypes
		// signed data typed
		// (2^8)/2=256/2=128
		byte b1=127;  //less 128,greater than 129(128......+127)
		System.out.println("b1:"+b1);
		short shortmaxvalue=32767;  //2^16
		System.out.println("s1:"+shortmaxvalue);
		short shortminvalue=-32768; //2^16
		System.out.println("s1:"+shortminvalue);
		int intmaxvalue=2147483647;	//2^32
		System.out.println("Int max value:"+intmaxvalue);
		int intminvalue=-2147483648;	//2^32
		System.out.println("Int min value:"+intminvalue);
		long longmaxvalue=9223372036854775807L;	//2^64
		System.out.println("Long max value:"+longmaxvalue);
		long longminvalue=-9223372036854775808L;	//2^64
		System.out.println("Long min value:"+longminvalue);
		float floatmaxvalue=2147483648.5432F;	//2^32
		System.out.println("Float max value:"+floatmaxvalue);
		float floatminvalue=-2147483648.111111F;	//2^32
		System.out.println("Float min value:"+floatminvalue);
		double doublemaxvalue=2147483648.5432d;	//2^64
		System.out.println("Double max value:"+doublemaxvalue);
		double doubleminvalue=-2147483648.111111d;	//2^64
		System.out.println("Double min value:"+doubleminvalue);
		char c1='A';
		System.out.println("c1="+c1);
		char c2='a';
		System.out.println("c2="+c2);
		int asciivalueofc1=(int)c1;
		System.out.println("ASCII value of c1:"+asciivalueofc1);
		int asciivalueofc2=(int)c2;
		System.out.println("ASCII value of c2:"+asciivalueofc2);
		}

}
