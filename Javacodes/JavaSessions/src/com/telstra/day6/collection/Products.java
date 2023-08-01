package com.telstra.day6.collection;

public class Products {
	
	public int id;
	public String name;
	public String category;
	public Products(int id,String name,String category) {
		this.id=id;
		this.category=category;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public String toString(){//overriding the toString() method  
		  return id+" "+name+" "+category;  
		 }  
	
}
