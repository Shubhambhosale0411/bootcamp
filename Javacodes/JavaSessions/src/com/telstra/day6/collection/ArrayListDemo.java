package com.telstra.day6.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		ArrayList obj=new ArrayList();
		System.out.println("elements to add");
		obj.add(1);
		obj.add(2);
		obj.add("shubham");
		
		System.out.println("size of array "+obj.size());
		
		System.out.println("element of size"+obj);
		
		obj.set(2, 3);
		obj.remove(2);
		
		System.out.println("check for existance "+obj.contains(2));
		
		obj.clear();
		
		System.out.println("after clear "+obj);
		
		
	}

}
