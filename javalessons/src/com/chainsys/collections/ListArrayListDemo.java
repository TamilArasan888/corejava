package com.chainsys.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.lang.reflect.*;

public class ListArrayListDemo{

	public static void main(String args[]) {
		lessonArrayList();

	}
		public static void lessonArrayList() {
			ArrayList<Emp> empArrayList=new ArrayList<Emp>(30);
			System.out.println("Init empArrayList size of empArrayList:"+empArrayList.size());
			try {
				for(int i=0;i<5;i++)
				{
					Emp e1=new Emp(i);
					e1.name="Emp"+i;
					empArrayList.add(e1);
					
				}
				System.out.println("Size of empArraylist after additions: "
				                      +empArrayList.size());
				
				Emp e3=(Emp) empArrayList.get(4);
				empArrayList.add(e3);
				System.out.println("Size of empArraylist after addition : "
							           +empArrayList.size());
				
				Emp e4=new Emp(4);
				e4.name="Elon Musk";
				empArrayList.add(e4);
				System.out.println("Freq of [EMP ID-4] in Arraylist - : "
				       +Collections.frequency(empArrayList,e3));
				
				Iterator<Emp> empIterator=empArrayList.iterator();
				while(empIterator.hasNext())

				{
					Object element = empIterator.next();//return current object 
					Emp e1=(Emp) element;
//					System.out.println("\t"+e1.getID() +" "+e1.name);
				}
			}
			catch(Exception err)
			{
				System.out.println("ERROR!!!"+err.getMessage());
			}
			
//			ArrayList<String> stringArrayList=new ArrayList<String>();
//			System.out.println("Initial size of stringArrayList : "+stringArrayList.size());
//			try {
//				stringArrayList.add("car");
//				stringArrayList.add("auto");
//				stringArrayList.add("egg");
//				stringArrayList.add("box");
//				stringArrayList.add("doll");
//				stringArrayList.add("fan");
////			will insert a new value
////			pushing the current value of index 1 to the next index
//				System.out.println("Size of stringarraylist after additions : "+stringArrayList.size());
//				System.out.println("contents of stringarraylist : "+stringArrayList);
////				will replace the value in index2
//				stringArrayList.set(2, "xenas");
//				System.out.println("after set(2) :"+stringArrayList);
//				System.out.println("Last index of:'fan': "+stringArrayList);
////				remove the final instance of 'fan'
//				stringArrayList.remove("fan");
//				stringArrayList.remove(2);
//				System.out.println("size after remove : "+stringArrayList.size());
//				System.out.println("contents of stringlist : "+stringArrayList);
//			}
//			catch(Exception err){
//				System.out.println(err.getMessage());
//				
//			}
		
}
}
