package com.chainsys.collections;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;



class MapTreeMapDemo {

	public static void main(String[] args) {
	
		TreeMap<String,Double> tm=new TreeMap<String,Double>();
		tm.put("John Doe", 3434.34);
		tm.put("Tom Smith", 123.22);
		tm.put("Jane baker", 1378.00);
		tm.put("Tod Hall", 99.22);
		tm.put("Ralph smith", -19.08);
		
		Set<Map.Entry<String,Double>> set = tm.entrySet();
		Iterator<Map.Entry<String,Double>> i =set.iterator();
		while(i.hasNext())
		{
			Map.Entry<String,Double> me =i.next();
			System.out.println(me.getKey()+" :");
			System.out.println(me.getValue());
		}
		System.out.println();
		//Deposit 1000 into john doe's account
		double balance =tm.get("John Doe");
		tm.put("John Doe",(balance+1000));
		System.out.println("John doe New Balance : "+tm.get("John Doe"));
	}

}
