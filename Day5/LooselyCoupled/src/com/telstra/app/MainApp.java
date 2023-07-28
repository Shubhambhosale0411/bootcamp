package com.telstra.app;

import com.telstra.service.BookingService;
public class MainApp {

	public static void main(String[] args) {

		
		BookingService bookingservice=new BookingService();
		bookingservice.bookTicket();

	}

}
