package com.telstra.service;

import com.telstra.dao.DbConnect;
import com.telstra.dao.MySql;

public class BookingService {
	DbConnect dbconnect;
	
	public BookingService() {
		
		dbconnect=new MySql();  //looselycoupled
	}
	public void bookTicket()
	{
		dbconnect.databaseproperty();
		System.out.println("ticket booked");
	}
}
