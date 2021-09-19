package com.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
		
	     /*
		Map<String,Integer>hm=new HashMap<>();
		String s1="hk";
		hm.put(s1, 1);
		hm.put("HK", 2);
		hm.put("KK", 3);
		hm.put("JK", 4);
		System.out.println(hm);
		s1.toUpperCase();
		//System.out.println(hm);
		Integer i1=(Integer)hm.get("hk");
		System.out.println(i1);
		//hm.get("KK");
		System.out.println(hm.get("KK"));
                 */
	
	     	    Map<Employee, Employee1> map=new HashMap<>();
	     Employee e1=new Employee();   //key e1 
	    Employee1 e2=new Employee1();  //value e2
      //for key and value store as an object..
	    
	  //for Employee
	    e1.setId(101);
	    e1.setName("sanjay");
	    e1.setAge(25);
	    
	    
	    //for Employee1
	    e2.setId(10);
	    e2.setName("KL");
	    e2.setAge(20);
	    map.put(e1, e2);

	    System.out.println(map);
	    
	    //System.out.println(map.get(e1));
	
	}

}
