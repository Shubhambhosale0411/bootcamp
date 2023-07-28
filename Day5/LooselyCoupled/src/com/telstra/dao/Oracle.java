package com.telstra.dao;

public class Oracle implements DbConnect {

	@Override
	public void databaseproperty() {
		System.out.println("connecting to oracle");
	}
	
	

}
