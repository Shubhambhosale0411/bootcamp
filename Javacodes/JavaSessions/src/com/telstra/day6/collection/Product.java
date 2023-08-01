package com.telstra.day6.collection;

import java.util.ArrayList;

public class Product {

	public static void main(String[] args) {
		
		ArrayList<Integer> num1=new ArrayList<Integer>();
		
		num1.add(1);
		num1.add(2);
		num1.add(3);
		num1.add(4);
		num1.add(5);
		num1.add(6);
		System.out.println("num1: "+num1);
		
		ArrayList<Integer> num2=new ArrayList<Integer>();
		num2.add(7);
		num2.add(8);
		num2.add(9);
		num2.add(10);
		
		System.out.println("num2 "+num2);
		num2.addAll(num1);
		//System.out.println("num2 updated "+num2);
		
		for(Integer num : num2)
		{
			System.out.println(num);
		}
			
		
	}

}
