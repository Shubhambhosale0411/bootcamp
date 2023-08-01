package com.telstra.day6.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class StackDemo {

	public static void main(String[] args) {
		
		//HashSet<String> fruit=new HashSet<>();
		
		TreeSet<String>fruit=new TreeSet<>();
		//LinkedHashSet<String>fruit= new LinkedHashSet<>();
		fruit.add("banana");
		fruit.add("apple");
		fruit.add("banana");
		fruit.add("peru");
		fruit.add("mango");
		System.out.println("elements are "+fruit);
	}

}
