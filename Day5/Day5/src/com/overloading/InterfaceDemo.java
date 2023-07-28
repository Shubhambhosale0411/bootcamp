package com.overloading;


interface Bank{
	int salary=5000;
	void greet();
}
interface RBI extends Bank{
	
	void atmguide();
}
class Axis implements Bank{
	@Override
	public void greet() {
		System.out.println("welcome all");
	}
	public void atmguide() {
		System.out.println("pin sale rules");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Axis axis=new Axis();
		axis.atmguide();
	}

}
