package com.chainsys.collections;

import java.io.Serializable;

public class Emp implements Serializable{

	private final int id;
	public String name;
	public double Name;
	
	public Emp(int v1) {
		id=v1;
	}
	
	public double getid() {
		return id;
	}
		@Override
	public boolean equals(Object obj) {
		Class c1=obj.getClass();//getClass()(metadata about object) is used to find where the object c1 is created
		boolean flag=false;
		if(c1==this.getClass()) {
			Emp other=(Emp)obj;
			if(this.hashCode()==other.hashCode())
				flag=true;
		}
		return flag;
	}
		
		/*public int hashCode() {
			return this.id;
		}*/
}
