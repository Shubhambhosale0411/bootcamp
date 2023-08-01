package com.telstra.day6.collection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String, String>hm=new HashMap<String, String>();
		hm.put("sacin", "batsman");
		hm.put("dhoni", "batsman");
		hm.put("sacin", "commentator");
		hm.put("virat", "batsman");
		
		//System.out.println(hm.get("virat"));
		
		System.out.println(hm.values());
		System.out.println(hm.keySet());
		
		for(String key:hm.keySet())
		{
			System.out.println("Key: "+key+"  values: "+hm.get(key));
		}
	}

}
