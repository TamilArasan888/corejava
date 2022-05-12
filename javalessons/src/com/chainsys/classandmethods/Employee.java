package com.chainsys.classandmethods;
/**
 * This a class that contains employee related data
 * @author tami3130
 *Created on :25 mar 2022
 */

public class Employee {
	private final int empID;
	private String name;
	private String city;
	private long salary;
	
	//constructor
	public Employee(int empID) {
		//assigning value to read-only field
		this.empID=empID;
	}
	public int getempID() {
		return empID;
	}
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name=name;
	}
	
	
	public String getcity() {
		return city;
	}
	public void setcity(String city) {
		this.city=city;
	}
	
	public long getsalary() {
		return salary;
	}
	public void setsalary(long salary) {
		this.salary=salary;
	}




}
