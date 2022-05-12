package com.chainsys.classandmethods;
/**
 * 
 * @author tami3130
 *
 */
public class Car {
	private final String regno;
	private int yearofpurchase;
	private String color;
	private String fuel;
	
	public Car(String rno) 
	{
		this.regno=rno;
	}

	public String getRegno() {
		return regno;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public int getYearofpurchase() {
		return yearofpurchase;
	}

	public void setYearofpurchase(int yearofpurchase) {
		this.yearofpurchase = yearofpurchase;
	}

	
	
}
