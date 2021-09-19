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
	
	     	    Map<Employee, Integer> map=new HashMap<>();
	    
	    
	    Employee e1=new Employee();
	    e1.setId(101);
	    e1.setName("sanjay");
	    e1.setAge(25);
	    map.put(e1, 10);

	    //System.out.println(map);
	    
	    System.out.println(map.get(e1));
	
	}

}
