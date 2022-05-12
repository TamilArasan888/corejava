package com.chainsys.strings;

public class StringBuilderDemo {
	public static void testA()
	{
		String firststring="Hello how are you today. Is the weather hot or cold. ";
		StringBuilder stringbuilder=new StringBuilder();
//		set some starting value to capacity
		stringbuilder.ensureCapacity(250);
		System.out.println("Length="+stringbuilder.length());
		System.out.println("Capacity="+stringbuilder.capacity());
		
		stringbuilder.append(firststring);
		System.out.println("Buffer="+stringbuilder);
		System.out.println("Length="+stringbuilder.length());
		System.out.println("Capacity="+stringbuilder.capacity());
		
		firststring="wish it rains this week";
		stringbuilder.append(firststring);
		System.out.println("Buffer="+stringbuilder);
		System.out.println("Length="+stringbuilder.length());
		System.out.println("Capacity="+stringbuilder.capacity());
		
//		reduce capacity to length
		stringbuilder.trimToSize();
		System.out.println("\tLength="+stringbuilder.length());
		System.out.println("\tCapacity="+stringbuilder.capacity());
		
//		replace
		stringbuilder.replace(3,8,"This is a Test!!!");
		System.out.println("Replace="+stringbuilder);
		
		
//		insert
		stringbuilder.insert(10,"This is august");
		System.out.println("Insert="+stringbuilder);
		System.out.println("\tLength="+stringbuilder.length());
		System.out.println("\tCapacity="+stringbuilder.capacity());
		
//		delete
		stringbuilder.delete(5,20);
		System.out.println("Delete="+stringbuilder);
		System.out.println("\tLength="+stringbuilder.length());
		System.out.println("\tCapacity="+stringbuilder.capacity());
		
		
	}

}
