package com.telstra.Day4.exceptions;

import java.io.IOException;

class User{
	//unchecked
	public void checkEligiblity(int age)
	{
		if(age>=18)
		{
			System.out.println("you are eligible");
		}
		else {
			throw new ArithmeticException("not eligible");
		}
	}
	//checked
	public void checkEligiblity2(int age)throws IOException
	{
		if(age>=18)
		{
			System.out.println("you are eligible");
		}
		else {
			throw new IOException("not eligible");
		}
	}
}

public class ThrowDemo {

	public static void main(String[] args) {
		try
		{
			User user=new User();
			user.checkEligiblity(12);
		}
		catch(Exception e) {
			System.out.println("exception occured");
		}
		

	}

}
