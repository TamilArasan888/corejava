package com.chainsys.miniproject.test;

import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.EmployeeDao;
import com.chainsys.miniproject.pojo.Employee;

public class TestEmployeeDao {

		public static void testGetAllEmployees() {
		List<Employee> allEmployees=EmployeeDao.getAllEmployee();
		Iterator<Employee> empIterator=allEmployees.iterator();
		
		while(empIterator.hasNext()) {
			Employee emp=empIterator.next();
			System.out.println(emp.getE_Id()+" "+emp.getFirst_Name()+" "+emp.getSalary());
			
		}}
		
		public static void testGetEmployeeById() {
			Employee emp=EmployeeDao.getEmployeeById(126);
			System.out.println("Employee ID :"+emp.getE_Id()+"\n"+"Employee_Name : "+emp.getFirst_Name()+"\n"+"Employee Salary : "+emp.getSalary());
			}
		
		public static void testInsertEmployee() {
			
			Employee newemp=new Employee();
			newemp.setE_Id(800);
			newemp.setFirst_Name("Tamil");
			newemp.setLast_Name("Arasan");
			newemp.setEmail("tamil888@gmail.com");
			Calendar c1=Calendar.getInstance();
			java.util.Date newDate=c1.getTime();
			newemp.setHire_Date(newDate);
			newemp.setJob_ID("IT_PROG");
			newemp.setSalary(25000);
			int result=EmployeeDao.insertEmployee(newemp);
			System.out.println(result);
		}
		
		public static void testUpdateEmployee() {
			Employee oldEmployee = EmployeeDao.getEmployeeById(800);
			System.out.println(oldEmployee.getE_Id()+" "+oldEmployee.getFirst_Name()+" "+oldEmployee.getSalary());

			oldEmployee.setFirst_Name("Sri");
			oldEmployee.setLast_Name("Kanth");
			oldEmployee.setEmail("Sri123@gmail.com");
			Calendar c1=Calendar.getInstance();
			java.util.Date newDate=c1.getTime();
			oldEmployee.setHire_Date(newDate);
			oldEmployee.setJob_ID("IT_PROG");
			oldEmployee.setSalary(30000);
			int result=EmployeeDao.insertEmployee(oldEmployee);
			System.out.println(result);
			}
		
		
	}

