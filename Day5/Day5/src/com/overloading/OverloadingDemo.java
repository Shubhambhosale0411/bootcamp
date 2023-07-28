package com.overloading;


class Flipkart{
	void filter()
	{
		System.out.println("default search");
	}
	void filter(int price)
	{
		
	}
	void filter(String brand,int price)
	{
		System.out.println(brand+" "+price);
	}
}

public class OverloadingDemo {

	public static void main(String[] args) {
		Flipkart flipkart=new Flipkart();
		flipkart.filter("gucci",5000);
	}

}
