package com.takinginput;
import java.util.Scanner;

class Emp{
	int id;
	String name;
	static String dept;
}

class parent{
	int id;
	public parent(int id)
	{
		System.out.println("this is parent with id= "+id);
	}
}

class child extends parent{
	public child()
	{
		super(3);
		System.out.println("this is child one");
	}
}

public class StaticDemo {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child obj=new child();
		
	}
	
}
