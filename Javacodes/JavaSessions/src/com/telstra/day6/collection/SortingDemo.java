package com.telstra.day6.collection;

import java.util.ArrayList;
import com.telstra.day6.collection.*;
public class SortingDemo {

	public static void main(String[] args) {
		//Products product=new Products();
		ArrayList<Products>product=new ArrayList<>();
		product.add(new Products(1,"laptop","electronics"));
		product.add(new Products(2,"PC","electronics"));
		product.add(new Products(3,"Mobiles","electronics"));
		product.add(new Products(4,"Dress","accesories"));
		
		for(Products pro:product)
		{
			System.out.println(pro);
		}
	}

}
