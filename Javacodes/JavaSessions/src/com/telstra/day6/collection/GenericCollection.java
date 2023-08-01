package com.telstra.day6.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;

public class GenericCollection {

	public static void main(String[] args) {
		
		ArrayList<String>batch1=new ArrayList<String>();
		batch1.add("rohit");
		batch1.add("john");
		batch1.add("sourab");
		batch1.add("rahul");
		
		ArrayList<String>batch2=new ArrayList<String>();
		batch2.add("anil");
		batch2.add("manas");
		batch2.add("rohit");
		batch2.add("rahul");
		batch2.add("karan");
		ArrayList<String>final_sol=new ArrayList<String>();
		LinkedHashSet<String> sol= new LinkedHashSet<String>();
		
		sol.addAll(batch1);
		sol.addAll(batch2);
		
		final_sol.addAll(sol);
		Collections.sort(final_sol);
		
		for(String answer:final_sol)
		{
			System.out.println(answer);
		}	
	}

}
