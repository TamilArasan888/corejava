package com.chainsys.unittest;
import com.chainsys.interfaces.Arithmetic;

public class TestArithmetic {
	public static void main(String args[])
	{
    Arithmetic obj = new Arithmetic();
	System.out.println(obj.add(2, 5));
	System.out.println(obj.divide(10, 5));
	System.out.println(obj.multiply(2, 5));
}
}