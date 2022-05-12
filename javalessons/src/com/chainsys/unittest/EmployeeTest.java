package com.chainsys.unittest;
import com.chainsys.classandmethods.Employee;

public class EmployeeTest {
	
	public static void testempid() {
		Employee firstemployee=new Employee(1234);
		System.out.println(firstemployee.getempID());
	}
	
	public static void testempname() {
		Employee firstemployee=new Employee(1234);
		firstemployee.setname("TamilArasan");
		System.out.println(firstemployee.getname());
	}
	
	public static void testcity() {
		Employee firstemployee=new Employee(1234);
		firstemployee.setcity("Madurai");
		System.out.println(firstemployee.getcity());
	}
	
	public static void testsalary() {
	Employee firstemployee=new Employee(1234);
	firstemployee.setsalary(50000);
	System.out.println(firstemployee.getsalary());
	}

}
