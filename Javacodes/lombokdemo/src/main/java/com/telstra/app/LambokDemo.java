package com.telstra.app;

import com.telstra.model.Employee;

public class LambokDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee emp=new Employee();
			System.out.println(""+emp.getName());
			emp.setName("this is shubham");
			System.out.println("who are you "+emp.getName());
	}

}
