package com.telstra.doubtlession;



class A1{
	public void show1()
	{
		System.out.println("in A show");
	}
}

class B1 extends A1{
	public void show1()
	{
		System.out.println("in B show");
	}
}



public class UpDowncastingDemo {

	public static void main(String[] args) {
			A1 obj= new B1();
			obj.show1();
			//only works when overriding in class else only methods present in parent will be accessed

	}

}
