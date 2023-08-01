package com.telstra.Day4.exceptions;

class InValidAgeException extends RuntimeException 
{ 	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	String msg; 
	public InValidAgeException(String msg) 
	{ 
		super(); 
		this.msg = msg; 
	} 
	public String getMsg() 
		{ 
		return msg; 
		} 
}


class Customer { 
	public void checkEligiblity(int age) 
	{ 
		if(age>=18) 
			System.out.println("eligible to vote");
		else 
			throw new InValidAgeException("age is less, minimum should be 18"); 
	} 
}

public class CustomExceptionDemo 
{ 
	public static void main(String[] args) 
	{ 
		Customer customer = new Customer(); 
		try { 
			customer.checkEligiblity(12); 
			} 
		catch (InValidAgeException e) 
		{ 
			System.out.println(e.getMsg()); 
			} 
		}
}

