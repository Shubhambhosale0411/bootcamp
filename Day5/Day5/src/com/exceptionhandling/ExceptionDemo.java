package com.exceptionhandling;
import java.util.*;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		System.out.println("enter any integer");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		try {
		System.out.println(a/0);
		}
		catch(Exception e ) {
			System.out.println("something went wrong");
		}
		finally
		{
			System.out.println("all done");
		}
		
	}

}
