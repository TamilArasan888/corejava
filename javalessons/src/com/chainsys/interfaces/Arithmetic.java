package com.chainsys.interfaces;
public class Arithmetic implements ICalculator{

	
	public int add(int v1, int v2) {
		 
		return v1 + v2;
	}

	
	public int multiply(int v1, int v2) {
		
		return v1 * v2;
	}

	
	public int divide(int v1, int v2) {
		
		return v1/v2;
	}
}
