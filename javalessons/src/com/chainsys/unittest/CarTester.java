package com.chainsys.unittest;

import com.chainsys.classandmethods.Car;

public class CarTester {
	public static void testcar() 
	{
		Car firstcar=new Car("TN 10 A 001");
		firstcar.setColor("Red");
		firstcar.setFuel("Petrol");
		firstcar.setYearofpurchase(2001);
		
		System.out.println(firstcar.getRegno());
		System.out.println(firstcar.getColor());
		System.out.println(firstcar.getFuel());
		System.out.println(firstcar.getYearofpurchase());

	}

}
